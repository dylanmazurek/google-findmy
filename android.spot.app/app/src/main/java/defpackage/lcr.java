package defpackage;

import android.support.design.widget.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum lcr implements ljp {
    NOTIFICATION_FAILURE_UNSPECIFIED(0),
    BAD_CHANNEL(1),
    CHANNEL_NOT_FOUND(34),
    CHANNEL_BLOCKED(35),
    USER_BLOCKED(6),
    BAD_PAYLOAD(2),
    INSUFFICIENT_DATA_NO_TITLE(7),
    INSUFFICIENT_DATA_NO_TEXT(8),
    DROPPED_BY_VERSION(41),
    DROPPED_OLDER_THAN_FIRST_REGISTRATION(51),
    THREAD_ALREADY_DISMISSED(53),
    DROPPED_BY_STATE(65),
    DROPPED_EXPIRED(66),
    MAX_NOTIFICATION_COUNT_REACHED(42),
    DROPPED_BY_CLIENT(3),
    INVALID_USER(4),
    RECIPIENT_NOT_FOUND(9),
    RECIPIENT_NOT_REGISTERED(10),
    RECIPIENT_INVALID_CREDENTIALS(25),
    FAILED_TO_DOWNLOAD_IMAGE(11),
    FAILED_TO_FETCH_NOTIFICATIONS_BY_ID(37),
    FAILED_TO_FETCH_LATEST_NOTIFICATIONS(12),
    FAILED_TO_FETCH_UPDATED_NOTIFICATIONS(13),
    FAILED_TO_REGISTER(14),
    FAILED_TO_REGISTER_OTHER_ACCOUNT(63),
    FAILED_TO_UNREGISTER(15),
    FAILED_TO_UPDATE_THREAD_STATE(16),
    FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN(17),
    FAILED_TO_FETCH_SUBSCRIPTIONS(38),
    FAILED_TO_SUBSCRIBE_TO_TOPICS(18),
    FAILED_TO_UNSUBSCRIBE_FROM_TOPICS(19),
    FAILED_TO_FETCH_PREFS(20),
    FAILED_TO_UPDATE_PREFS(21),
    FAILED_TO_ACKNOWLEDGE(22),
    FAILED_TO_FETCH_MULTI_USER_BADGE_COUNT(39),
    FAILED_TO_REGISTER_LOCATION(54),
    FAILED_TO_REGISTER_PUSHKIT(55),
    FAILED_TO_REGISTER_LIVE_ACTIVITY(62),
    FAILED_TO_REGISTER_LIVE_ACTIVITY_PTS(67),
    FAILED_TO_COUNT_THREADS(56),
    FAILED_TO_UPDATE_ALL_THREAD_STATES(59),
    FAILED_TO_POST_LOCAL_NOTIFICATION(64),
    FAILED_TO_GET_IID(23),
    INCONSISTENT_COUNT(24),
    UPSTREAM_TASK_TOO_BIG(26),
    UPSTREAM_UPDATE_THREAD_STATE_TASK_PARSE_ERROR(27),
    UPSTREAM_UNKNOWN_SEND_ERROR(28),
    UPSTREAM_INVALID_PARAMETERS(29),
    UPSTREAM_TOO_BIG(30),
    UPSTREAM_SENT_BUT_NOT_IN_TASK_TABLE(31),
    FAILED_ACCOUNT_DATA_CLEANUP(36),
    DATABASE_ERROR(40),
    FAILED_TO_APPLY_CUSTOMIZATION(52),
    UPSTREAM_ZOMBIE_FOUND(32),
    UPSTREAM_TOO_MANY_PENDING_MESSAGES(33),
    SDK_DOES_NOT_SUPPORT(5),
    FAILED_TO_DECRYPT_PAYLOAD_FALLBACK_TO_PLACEHOLDER(57),
    FAILED_TO_DECRYPT_PAYLOAD_NO_PLACEHOLDER(58),
    FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER(60),
    FAILED_TO_DECOMPRESS(61);

    public final int ai;

    lcr(int i) {
        this.ai = i;
    }

    public static lcr b(int i) {
        switch (i) {
            case 0:
                return NOTIFICATION_FAILURE_UNSPECIFIED;
            case 1:
                return BAD_CHANNEL;
            case 2:
                return BAD_PAYLOAD;
            case 3:
                return DROPPED_BY_CLIENT;
            case 4:
                return INVALID_USER;
            case 5:
                return SDK_DOES_NOT_SUPPORT;
            case 6:
                return USER_BLOCKED;
            case 7:
                return INSUFFICIENT_DATA_NO_TITLE;
            case 8:
                return INSUFFICIENT_DATA_NO_TEXT;
            case 9:
                return RECIPIENT_NOT_FOUND;
            case 10:
                return RECIPIENT_NOT_REGISTERED;
            case 11:
                return FAILED_TO_DOWNLOAD_IMAGE;
            case 12:
                return FAILED_TO_FETCH_LATEST_NOTIFICATIONS;
            case 13:
                return FAILED_TO_FETCH_UPDATED_NOTIFICATIONS;
            case 14:
                return FAILED_TO_REGISTER;
            case 15:
                return FAILED_TO_UNREGISTER;
            case 16:
                return FAILED_TO_UPDATE_THREAD_STATE;
            case 17:
                return FAILED_TO_UPDATE_THREAD_STATE_BY_TOKEN;
            case 18:
                return FAILED_TO_SUBSCRIBE_TO_TOPICS;
            case 19:
                return FAILED_TO_UNSUBSCRIBE_FROM_TOPICS;
            case 20:
                return FAILED_TO_FETCH_PREFS;
            case 21:
                return FAILED_TO_UPDATE_PREFS;
            case 22:
                return FAILED_TO_ACKNOWLEDGE;
            case 23:
                return FAILED_TO_GET_IID;
            case R.styleable.TextInputLayout_cursorColor /* 24 */:
                return INCONSISTENT_COUNT;
            case R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                return RECIPIENT_INVALID_CREDENTIALS;
            case R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                return UPSTREAM_TASK_TOO_BIG;
            case R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                return UPSTREAM_UPDATE_THREAD_STATE_TASK_PARSE_ERROR;
            case R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                return UPSTREAM_UNKNOWN_SEND_ERROR;
            case R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                return UPSTREAM_INVALID_PARAMETERS;
            case R.styleable.TextInputLayout_endIconMode /* 30 */:
                return UPSTREAM_TOO_BIG;
            case R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                return UPSTREAM_SENT_BUT_NOT_IN_TASK_TABLE;
            case R.styleable.TextInputLayout_endIconTint /* 32 */:
                return UPSTREAM_ZOMBIE_FOUND;
            case R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                return UPSTREAM_TOO_MANY_PENDING_MESSAGES;
            case R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                return CHANNEL_NOT_FOUND;
            case 35:
                return CHANNEL_BLOCKED;
            case R.styleable.TextInputLayout_errorEnabled /* 36 */:
                return FAILED_ACCOUNT_DATA_CLEANUP;
            case R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                return FAILED_TO_FETCH_NOTIFICATIONS_BY_ID;
            case R.styleable.TextInputLayout_errorIconTint /* 38 */:
                return FAILED_TO_FETCH_SUBSCRIPTIONS;
            case R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                return FAILED_TO_FETCH_MULTI_USER_BADGE_COUNT;
            case R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                return DATABASE_ERROR;
            case R.styleable.TextInputLayout_errorTextColor /* 41 */:
                return DROPPED_BY_VERSION;
            case R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
                return MAX_NOTIFICATION_COUNT_REACHED;
            default:
                switch (i) {
                    case R.styleable.TextInputLayout_passwordToggleContentDescription /* 51 */:
                        return DROPPED_OLDER_THAN_FIRST_REGISTRATION;
                    case R.styleable.TextInputLayout_passwordToggleDrawable /* 52 */:
                        return FAILED_TO_APPLY_CUSTOMIZATION;
                    case R.styleable.TextInputLayout_passwordToggleEnabled /* 53 */:
                        return THREAD_ALREADY_DISMISSED;
                    case R.styleable.TextInputLayout_passwordToggleTint /* 54 */:
                        return FAILED_TO_REGISTER_LOCATION;
                    case R.styleable.TextInputLayout_passwordToggleTintMode /* 55 */:
                        return FAILED_TO_REGISTER_PUSHKIT;
                    case R.styleable.TextInputLayout_placeholderText /* 56 */:
                        return FAILED_TO_COUNT_THREADS;
                    case R.styleable.TextInputLayout_placeholderTextAppearance /* 57 */:
                        return FAILED_TO_DECRYPT_PAYLOAD_FALLBACK_TO_PLACEHOLDER;
                    case R.styleable.TextInputLayout_placeholderTextColor /* 58 */:
                        return FAILED_TO_DECRYPT_PAYLOAD_NO_PLACEHOLDER;
                    case R.styleable.TextInputLayout_prefixText /* 59 */:
                        return FAILED_TO_UPDATE_ALL_THREAD_STATES;
                    case R.styleable.TextInputLayout_prefixTextAppearance /* 60 */:
                        return FAILED_TO_DECOMPRESS_FALLBACK_TO_PLACEHOLDER;
                    case R.styleable.TextInputLayout_prefixTextColor /* 61 */:
                        return FAILED_TO_DECOMPRESS;
                    case R.styleable.TextInputLayout_shapeAppearance /* 62 */:
                        return FAILED_TO_REGISTER_LIVE_ACTIVITY;
                    case R.styleable.TextInputLayout_shapeAppearanceOverlay /* 63 */:
                        return FAILED_TO_REGISTER_OTHER_ACCOUNT;
                    case R.styleable.TextInputLayout_startIconCheckable /* 64 */:
                        return FAILED_TO_POST_LOCAL_NOTIFICATION;
                    case R.styleable.TextInputLayout_startIconContentDescription /* 65 */:
                        return DROPPED_BY_STATE;
                    case R.styleable.TextInputLayout_startIconDrawable /* 66 */:
                        return DROPPED_EXPIRED;
                    case R.styleable.TextInputLayout_startIconMinSize /* 67 */:
                        return FAILED_TO_REGISTER_LIVE_ACTIVITY_PTS;
                    default:
                        return null;
                }
        }
    }

    @Override // defpackage.ljp
    public final int a() {
        return this.ai;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ai);
    }
}
