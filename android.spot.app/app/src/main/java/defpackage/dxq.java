package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dxq {
    SELECT_DEVICE("Button press", "Select device"),
    RING("Button press", "Ring"),
    LOCK("Button press", "Lock"),
    WIPE("Button press", "Wipe"),
    SETUP_LOCK_ERASE("Button press", "Setup lock and erase"),
    ENABLE_DEVICE_ADMIN("Button press", "Enable device admin"),
    LOCATE("Button press", "Locate"),
    DEVICE_INFO("Button press", "Device information"),
    RENAME("Button press", "Rename"),
    HELP_AND_FEEDBACK("Button press", "Help and feedback"),
    REFRESH("Button press", "Refresh"),
    REQUIRE_SIGN_IN("Button press", "Require sign in"),
    FEEDBACK("Button press", "Feedback"),
    VIEW_IN_GOOGLE_PLAY_STORE("Button press", "View in Play Store"),
    TERMS_OF_SERVICE("Button press", "Terms of service"),
    PRIVACY_POLICY("Button press", "Privacy policy"),
    OPEN_SOURCE_LICENSES("Button press", "Open source licenses"),
    WELCOME_SCREEN_ACCEPT("Button press", "Welcome screen accept"),
    WELCOME_SCREEN_CLOSE("Button press", "Welcome screen close"),
    RING_CONFIRMATION_ACCEPTED("Button press", "Ring confirmed"),
    RING_CONFIRMATION_CANCELLED("Button press", "Ring cancelled"),
    SET_PASSWORD_CONFIRMED("Button press", "Set password confirmed"),
    SET_PASSWORD_CANCELLED("Button press", "Set password cancelled"),
    LOCK_CONFIRMATION_ACCEPTED("Button press", "Lock confirmed"),
    LOCK_CONFIRMATION_CANCELLED("Button press", "Lock cancelled"),
    LOCK_PHONE_NUMBER_SET("Lock optional features", "Lock phone number set"),
    LOCK_MESSAGE_SET("Lock optional features", "Lock message set"),
    WIPE_CONFIRMATION_ACCEPTED("Button press", "Wipe confirmed"),
    WIPE_CONFIRMATION_CANCELLED("Button press", "Wipe cancelled"),
    SETUP_CONFIRMATION_ACCEPTED("Button press", "Setup confirmed"),
    SETUP_CONFIRMATION_CANCELLED("Button press", "Setup cancelled"),
    RENAME_ACCEPTED("Button press", "Rename confirmed"),
    RENAME_CANCELLED("Button press", "Rename cancelled"),
    AUTH_EXITED_WITHOUT_LOGIN("Application exit", "Application exit during authentication"),
    AUTH_SIGN_IN("Button press", "Sign in"),
    AUTH_SIGN_IN_NEVER_ASK_AGAIN_CHECKBOX_CHECKED("Checkbox status", "Never ask password again checked on sign in"),
    AUTH_SIGN_IN_SUCCESS("Auth result", "Success"),
    AUTH_SIGN_IN_FAILURE("Auth result", "Failure"),
    AUTH_HELP_ME("Button press", "Auth Help Me"),
    GUEST_LOGIN_SELECTED("Button press", "Guest account selected"),
    SECURITY_CHECKUP_ACCEPTED("Button press", "Security checkup accepted"),
    SECURITY_CHECKUP_CANCELLED("Button press", "Security checkup rejected"),
    SELECT_CATEGORY("Button press", "Select category"),
    SELECT_RINGING_VOLUME("Button press", "Select ringing volume");

    public final String S;
    public final String T;

    dxq(String str, String str2) {
        hwx.K(!TextUtils.isEmpty(str), "action cannot be empty");
        this.S = str;
        hwx.K(!TextUtils.isEmpty(str2), "label cannot be empty");
        this.T = str2;
    }
}
