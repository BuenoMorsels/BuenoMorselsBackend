package com.social.BuenoMorsels.Beans;

import javax.persistence.*;

@Entity
@Table
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="meal_id")
    private int mealId;
    private String title;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name="restaurant_id")
    private Restaurant restaurant;
    private String mealText;
    private int mealRating;
    @OneToOne
    @JoinColumn(name="meal_pic_id")
    private MealPic mealPic;
    private String sentAt;




}
