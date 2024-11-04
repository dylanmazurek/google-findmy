package defpackage;

import android.support.design.widget.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lpk {
    ANDROID_MAKE_SOUND,
    ANDROID_LOCK_SCREEN,
    ANDROID_SET_SCREEN_LOCK_PASSWORD,
    ANDROID_QUICK_LOCK_SCREEN,
    ANDROID_LOCATE,
    ANDROID_STOP_SOUND,
    ANDROID_WIPE,
    ANDROID_RENAME,
    ANDROID_ENABLE_DEVICE_ADMIN,
    ANDROID_REMIND,
    ANDROID_SETUP_PROMPT,
    FAST_PAIR_LOCATE,
    SPOT_LOCATE,
    SPOT_MAKE_SOUND,
    SPOT_STOP_SOUND,
    AUTO_DELETE_PROFILE,
    INFO_NOT_SET;

    public static lpk a(int i) {
        if (i != 35) {
            switch (i) {
                case 0:
                    return INFO_NOT_SET;
                case 1:
                    return ANDROID_MAKE_SOUND;
                case 2:
                    return ANDROID_LOCK_SCREEN;
                case 3:
                    return ANDROID_SET_SCREEN_LOCK_PASSWORD;
                case 4:
                    return ANDROID_LOCATE;
                case 5:
                    return ANDROID_STOP_SOUND;
                case 6:
                    return ANDROID_WIPE;
                case 7:
                    return ANDROID_RENAME;
                case 8:
                    return ANDROID_ENABLE_DEVICE_ADMIN;
                case 9:
                    return ANDROID_REMIND;
                case 10:
                    return FAST_PAIR_LOCATE;
                case 11:
                    return ANDROID_SETUP_PROMPT;
                case 12:
                    return ANDROID_QUICK_LOCK_SCREEN;
                default:
                    switch (i) {
                        case R.styleable.TextInputLayout_endIconMode /* 30 */:
                            return SPOT_LOCATE;
                        case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                            return SPOT_MAKE_SOUND;
                        case R.styleable.TextInputLayout_endIconTint /* 32 */:
                            return SPOT_STOP_SOUND;
                        default:
                            return null;
                    }
            }
        }
        return AUTO_DELETE_PROFILE;
    }
}
