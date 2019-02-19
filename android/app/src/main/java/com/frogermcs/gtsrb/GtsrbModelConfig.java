package com.frogermcs.gtsrb;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * The most of those information can be found in GTSRB_TensorFlow_MobileNet.ipynb
 */
public class GtsrbModelConfig {
    public static String MODEL_FILENAME = "gtsrb_model.lite";

    public static final int INPUT_IMG_SIZE_WIDTH = 224;
    public static final int INPUT_IMG_SIZE_HEIGHT = 224;
    public static final int FLOAT_TYPE_SIZE = 4;
    public static final int PIXEL_SIZE = 3;
    public static final int MODEL_INPUT_SIZE = FLOAT_TYPE_SIZE * INPUT_IMG_SIZE_WIDTH * INPUT_IMG_SIZE_HEIGHT * PIXEL_SIZE;
    public static final int IMAGE_MEAN = 0;
    public static final float IMAGE_STD = 255.0f;
    
    public static final List<String> OUTPUT_LABELS = Collections.unmodifiableList(
            Arrays.asList(
                    "20_speed",
                    "30_speed",
                    "50_speed",
                    "60_speed",
                    "70_speed",
                    "80_speed",
                    "80_lifted",
                    "100_speed",
                    "120_speed",
                    "no_overtaking_general",
                    "no_overtaking_trucks",
                    "right_of_way_crossing",
                    "right_of_way_general",
                    "give_way",
                    "stop",
                    "no_way_general",
                    "no_way_trucks",
                    "no_way_one_way",
                    "attention_general",
                    "attention_left_turn",
                    "attention_right_turn",
                    "attention_curvy",
                    "attention_bumpers",
                    "attention_slippery",
                    "attention_bottleneck",
                    "attention_construction",
                    "attention_traffic_light",
                    "attention_pedestrian",
                    "attention_children",
                    "attention_bikes",
                    "attention_snowflake",
                    "attention_deer",
                    "lifted_general",
                    "turn_right",
                    "turn_left",
                    "turn_straight",
                    "turn_straight_right",
                    "turn_straight_left",
                    "turn_right_down",
                    "turn_left_down",
                    "turn_circle",
                    "lifted_no_overtaking_general",
                    "lifted_no_overtaking_trucks"
            ));

    public static final int MAX_CLASSIFICATION_RESULTS = 3;
    public static final float CLASSIFICATION_THRESHOLD = 0.1f;
}
