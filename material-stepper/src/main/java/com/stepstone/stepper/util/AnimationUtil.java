package com.stepstone.stepper.util;

import android.animation.Animator;
import android.support.annotation.NonNull;
import android.view.View;

public class AnimationUtil {

    public static void animateView(@NonNull final View view, final boolean visible) {
        view.animate()
                .alpha(visible ? 1 : 0)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(@NonNull Animator animation) {
                        if (visible) {
                            view.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onAnimationEnd(@NonNull Animator animation) {
                        if (!visible) {
                            view.setVisibility(View.GONE);
                        }
                    }

                    @Override
                    public void onAnimationCancel(@NonNull Animator animation) {
                        if (!visible) {
                            view.setVisibility(View.GONE);
                        }
                    }

                    @Override
                    public void onAnimationRepeat(@NonNull Animator animation) {
                    }
                }).start();
    }
}
