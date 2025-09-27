package com.Ecommerce_Multivendor.Backend.service.impl;

import com.Ecommerce_Multivendor.Backend.exception.ReviewNotFoundException;
import com.Ecommerce_Multivendor.Backend.model.Product;
import com.Ecommerce_Multivendor.Backend.model.Review;
import com.Ecommerce_Multivendor.Backend.model.User;
import com.Ecommerce_Multivendor.Backend.repository.ReviewRepository;
import com.Ecommerce_Multivendor.Backend.request.CreateReviewRequest;
import com.Ecommerce_Multivendor.Backend.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;


    @Override
    public Review createReview(CreateReviewRequest req,
                               User user,
                               Product product) {
        Review newReview = new Review();

        newReview.setReviewText(req.getReviewText());
        newReview.setRating(req.getReviewRating());
        newReview.setProductImages(req.getProductImages());
        newReview.setUser(user);
        newReview.setProduct(product);

        product.getReviews().add(newReview);

        return reviewRepository.save(newReview);
    }

    @Override
    public List<Review> getReviewsByProductId(Long productId) {
        return reviewRepository.findReviewsByProductId(productId);
    }


    @Override
    public Review updateReview(Long reviewId,
                               String reviewText,
                               double rating,
                               Long userId) throws ReviewNotFoundException, AuthenticationException {
        Review review=reviewRepository.findById(reviewId)
                .orElseThrow(()-> new ReviewNotFoundException("Review Not found"));

        if(review.getUser().getId()!=userId){
            throw new AuthenticationException("You do not have permission to delete this review");
        }

        review.setReviewText(reviewText);
        review.setRating(rating);
        return reviewRepository.save(review);
    }

    @Override
    public void deleteReview(Long reviewId,Long userId) throws ReviewNotFoundException,
            AuthenticationException {
        Review review=reviewRepository.findById(reviewId)
                .orElseThrow(()-> new ReviewNotFoundException("Review Not found"));
        if(!Objects.equals(review.getUser().getId(), userId)){
            throw new AuthenticationException("You do not have permission to delete this review");
        }
        reviewRepository.delete(review);
    }

}
