package defpackage;

import android.support.design.widget.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbq {
    public final gbr a;

    public gbq(gbr gbrVar) {
        this.a = gbrVar;
    }

    public final String toString() {
        String str;
        String obj = super.toString();
        gbr gbrVar = this.a;
        int s = iqg.s(gbrVar.b);
        if (s != 0) {
            switch (s) {
                case 1:
                    break;
                case 2:
                    str = "AUTOMATED";
                    break;
                case 3:
                    str = "USER";
                    break;
                case 4:
                    str = "GENERIC_CLICK";
                    break;
                case 5:
                    str = "TAP";
                    break;
                case 6:
                    str = "KEYBOARD_ENTER";
                    break;
                case 7:
                    str = "MOUSE_CLICK";
                    break;
                case 8:
                    str = "LEFT_CLICK";
                    break;
                case 9:
                    str = "RIGHT_CLICK";
                    break;
                case 10:
                    str = "HOVER";
                    break;
                case 11:
                    str = "INTO_BOUNDING_BOX";
                    break;
                case 12:
                    str = "OUT_OF_BOUNDING_BOX";
                    break;
                case 13:
                    str = "PINCH";
                    break;
                case 14:
                    str = "PINCH_OPEN";
                    break;
                case 15:
                    str = "PINCH_CLOSED";
                    break;
                case 16:
                    str = "INPUT_TEXT";
                    break;
                case 17:
                    str = "INPUT_KEYBOARD";
                    break;
                case 18:
                    str = "INPUT_VOICE";
                    break;
                case 19:
                    str = "RESIZE_BROWSER";
                    break;
                case 20:
                    str = "ROTATE_SCREEN";
                    break;
                case 21:
                    str = "DIRECTIONAL_MOVEMENT";
                    break;
                case 22:
                    str = "SWIPE";
                    break;
                case 23:
                    str = "SCROLL_BAR";
                    break;
                case R.styleable.TextInputLayout_cursorColor /* 24 */:
                    str = "MOUSE_WHEEL";
                    break;
                case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                    str = "ARROW_KEYS";
                    break;
                case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                    str = "NAVIGATE";
                    break;
                case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                    str = "BACK_BUTTON";
                    break;
                case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                    str = "UNKNOWN_ACTION";
                    break;
                case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                    str = "HEAD_MOVEMENT";
                    break;
                case R.styleable.TextInputLayout_endIconMode /* 30 */:
                    str = "SHAKE";
                    break;
                case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                    str = "DRAG";
                    break;
                case R.styleable.TextInputLayout_endIconTint /* 32 */:
                    str = "LONG_PRESS";
                    break;
                case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                    str = "KEY_PRESS";
                    break;
                case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                    str = "ACTION_BY_TIMER";
                    break;
                case 35:
                    str = "DOUBLE_CLICK";
                    break;
                case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                    str = "DOUBLE_TAP";
                    break;
                case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                    str = "ROLL";
                    break;
                case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                    str = "DROP";
                    break;
                case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                    str = "FORCE_TOUCH";
                    break;
                case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                    str = "MULTI_KEY_PRESS";
                    break;
                case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                    str = "TWO_FINGER_DRAG";
                    break;
                case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                    str = "ENTER_PROXIMITY";
                    break;
                case R.styleable.TextInputLayout_helperText /* 43 */:
                case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                default:
                    str = "null";
                    break;
                case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                    str = "CAUSAL_USER_ACTION";
                    break;
                case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                    str = "CAUSAL_AUTOMATED";
                    break;
                case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                    str = "INPUT_STYLUS";
                    break;
                case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                    str = "TWO_FINGER_DRAG_UP";
                    break;
                case R.styleable.TextInputLayout_hintTextColor /* 50 */:
                    str = "TWO_FINGER_DRAG_DOWN";
                    break;
            }
            return obj + " " + str + " " + String.valueOf(gbrVar);
        }
        str = "UNASSIGNED_USER_ACTION_ID";
        return obj + " " + str + " " + String.valueOf(gbrVar);
    }
}
