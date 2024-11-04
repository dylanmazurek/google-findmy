package defpackage;

import android.support.design.widget.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzu implements fzs {
    public static final fzu a = new fzu();
    public final fzt[] b;

    private fzu() {
        int[] a2 = lmj.a();
        int i = 0;
        for (int i2 = 0; i2 < 82; i2++) {
            int i3 = a2[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                i = Math.max(i, i4);
            } else {
                throw null;
            }
        }
        this.b = new fzt[i + 1];
        int[] a3 = lmj.a();
        for (int i5 = 0; i5 < 82; i5++) {
            int i6 = a3[i5];
            int i7 = i6 - 1;
            if (i6 != 0) {
                if (i7 != 17 && i7 != 27 && i7 != 78 && i7 != 82) {
                    switch (i7) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            switch (i7) {
                                case 19:
                                case 20:
                                case 21:
                                    break;
                                default:
                                    switch (i7) {
                                        case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                                        case R.styleable.TextInputLayout_endIconTint /* 32 */:
                                        case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                                        case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                                        case 35:
                                        case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                                        case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                                        case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                                        case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                                        case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                                        case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                                        case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                                        case R.styleable.TextInputLayout_helperText /* 43 */:
                                        case R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
                                        case R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                                        case R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                                        case R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                                        case R.styleable.TextInputLayout_hintEnabled /* 48 */:
                                        case R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                                            break;
                                        default:
                                            switch (i7) {
                                                case R.styleable.TextInputLayout_placeholderText /* 56 */:
                                                case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                                                case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                                                case R.styleable.TextInputLayout_prefixText /* 59 */:
                                                case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                                                case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                                                case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                                                case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                                                case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                                                case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                                                case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                                                case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                                                case R.styleable.TextInputLayout_startIconScaleType /* 68 */:
                                                case R.styleable.TextInputLayout_startIconTint /* 69 */:
                                                case R.styleable.TextInputLayout_startIconTintMode /* 70 */:
                                                case R.styleable.TextInputLayout_suffixText /* 71 */:
                                                case R.styleable.TextInputLayout_suffixTextAppearance /* 72 */:
                                                case R.styleable.TextInputLayout_suffixTextColor /* 73 */:
                                                    break;
                                                default:
                                                    continue;
                                            }
                                    }
                            }
                    }
                }
                fzt[] fztVarArr = this.b;
                fzt fztVar = new fzt();
                fztVarArr[i7] = fztVar;
                int i8 = jis.d;
                fztVar.a = jmi.a;
            } else {
                throw null;
            }
        }
    }
}
