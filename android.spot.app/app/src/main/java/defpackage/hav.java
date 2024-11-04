package defpackage;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hav {
    private static final String a = "hav";

    private hav() {
    }

    public static void a(View view, String str, kxk kxkVar) {
        Activity activity;
        ag d = d(view);
        str.getClass();
        kxkVar.getClass();
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.accountsettings.action.VIEW_SETTINGS");
        intent.setPackage("com.google.android.gms").putExtra("extra.screenId", kxkVar.b).putExtra("extra.utmSource", "OG").putExtra("extra.accountName", str).putExtra("extra.themeChoice", 0);
        Map unmodifiableMap = Collections.unmodifiableMap(kxkVar.c);
        unmodifiableMap.getClass();
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            str2.getClass();
            intent.putExtra("extra.screen.".concat(str2), str3);
        }
        if (d != null) {
            activity = d.E();
        } else {
            activity = null;
        }
        if (activity == null) {
            activity = c(view.getContext());
        }
        activity.startActivityForResult(intent, 51332);
    }

    public static void b(View view, int i, Object obj, String str) {
        Activity activity;
        ActivityOptions activityOptions;
        Bundle bundle;
        if (obj != null) {
            String ak = frx.ak(obj);
            ljh k = kxk.d.k();
            int i2 = i - 1;
            if (!k.b.y()) {
                k.t();
            }
            kxk kxkVar = (kxk) k.b;
            kxkVar.a |= 1;
            kxkVar.b = i2;
            a(view, ak, (kxk) k.q());
            return;
        }
        ag d = d(view);
        Bundle bundle2 = null;
        if (d != null) {
            activity = d.E();
        } else {
            activity = null;
        }
        if (activity == null) {
            activity = c(view.getContext());
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle3 = new Bundle();
                bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle3);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            if (Build.VERSION.SDK_INT >= 24) {
                String a2 = rl.a();
                if (!TextUtils.isEmpty(a2)) {
                    if (intent.hasExtra("com.android.browser.headers")) {
                        bundle = intent.getBundleExtra("com.android.browser.headers");
                    } else {
                        bundle = new Bundle();
                    }
                    if (!bundle.containsKey("Accept-Language")) {
                        bundle.putString("Accept-Language", a2);
                        intent.putExtra("com.android.browser.headers", bundle);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 34) {
                activityOptions = rk.a();
                rm.a(activityOptions, false);
            } else {
                activityOptions = null;
            }
            if (activityOptions != null) {
                bundle2 = activityOptions.toBundle();
            }
            intent.setData(Uri.parse(str));
            activity.startActivity(intent, bundle2);
        } catch (ActivityNotFoundException e) {
            Log.e(a, String.format("Can't open URL '%s'. This can happen if there is no browser app on the device.", str), e);
        }
    }

    private static Activity c(Context context) {
        Activity activity = (Activity) hog.U(context, Activity.class);
        activity.getClass();
        return activity;
    }

    private static ag d(View view) {
        try {
            return be.d(view);
        } catch (IllegalStateException e) {
            Log.e(a, "Failed to find Fragment for view", e);
            return null;
        }
    }
}
