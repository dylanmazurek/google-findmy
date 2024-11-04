package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duo {
    private static final jnk a = jnk.l("com/google/android/apps/adm/accounts/GuestLoginUtils");
    private static final Uri b = Uri.parse("https://accounts.google.com/o/oauth2/cl");
    private static final Uri c = Uri.parse("https://www.google.com/android/find/limited_oauthcallback");
    private static final String d = TextUtils.join(" ", new String[]{"https://www.googleapis.com/auth/android_device_manager_limited", "https://www.googleapis.com/auth/client_channel", "https://www.googleapis.com/auth/userinfo.email", "https://www.googleapis.com/auth/keychain/web"});

    public static String a() {
        return b.buildUpon().appendQueryParameter("scope", d).appendQueryParameter("client_id", "289722593072-1tp4g48pf1nr2er5njssr3bdu24v0mi0.apps.googleusercontent.com").appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", c.toString()).appendQueryParameter("access_type", "online").build().toString();
    }

    public static void b(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(a()));
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((jni) ((jni) ((jni) a.f()).i(e)).j("com/google/android/apps/adm/accounts/GuestLoginUtils", "launchGuestModeInBrowser", '<', "GuestLoginUtils.java")).r("Unable to launch guest mode in web browser.");
        }
    }
}
