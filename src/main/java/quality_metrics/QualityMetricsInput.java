/*
 * Copyright 2014 Arthur Henning.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package quality_metrics;

import ij.ImagePlus;

/**
 *
 * @author Arthur Henning
 */
public class QualityMetricsInput {

    private ImagePlus perfectImage;
    private ImagePlus image1;
    private ImagePlus image2;

    public QualityMetricsInput() {
    }

    public QualityMetricsInput(ImagePlus perfectImage, ImagePlus image1, ImagePlus image2) {
        this.perfectImage = perfectImage;
        this.image1 = image1;
        this.image2 = image2;
    }

    public ImagePlus getPerfectImage() {
        return perfectImage;
    }

    public void setPerfectImage(ImagePlus perfectImage) {
        this.perfectImage = perfectImage;
    }

    public ImagePlus getImage1() {
        return image1;
    }

    public void setImage1(ImagePlus image1) {
        this.image1 = image1;
    }

    public ImagePlus getImage2() {
        return image2;
    }

    public void setImage2(ImagePlus image2) {
        this.image2 = image2;
    }

}
