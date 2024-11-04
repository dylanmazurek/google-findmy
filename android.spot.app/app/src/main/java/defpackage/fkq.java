package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fkq {
    private static final ta a = new ta();
    private static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            bym b2 = fme.b(context);
            return ((Context) b2.a).getPackageManager().getApplicationLabel(((Context) b2.a).getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return resources.getString(R.string.ok);
                }
                return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_enable_button);
            }
            return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_update_button);
        }
        return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_install_button);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 9) {
                                if (i != 20) {
                                    switch (i) {
                                        case 16:
                                            return e(context, "common_google_play_services_api_unavailable_text", a2);
                                        case 17:
                                            return e(context, "common_google_play_services_sign_in_failed_text", a2);
                                        case 18:
                                            return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_updating_text, a2);
                                        default:
                                            return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_unknown_issue, a2);
                                    }
                                }
                                return e(context, "common_google_play_services_restricted_profile_text", a2);
                            }
                            return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_unsupported_text, a2);
                        }
                        return e(context, "common_google_play_services_network_error_text", a2);
                    }
                    return e(context, "common_google_play_services_invalid_account_text", a2);
                }
                return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_enable_text, a2);
            }
            if (flu.c(context)) {
                return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_wear_update_text);
            }
            return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_update_text, a2);
        }
        return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_install_text, a2);
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", a.ae(i, "Unexpected error code "));
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f = f(context, str);
        if (f == null) {
            f = resources.getString(com.google.android.apps.adm.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, f, str2);
    }

    public static String f(Context context, String str) {
        bsy b2;
        Resources resources;
        ta taVar = a;
        synchronized (taVar) {
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 24) {
                b2 = bsy.d(bsv.a(configuration));
            } else {
                b2 = bsy.b(configuration.locale);
            }
            Locale f = b2.f(0);
            if (!f.equals(b)) {
                taVar.clear();
                b = f;
            }
            String str2 = (String) taVar.get(str);
            if (str2 != null) {
                return str2;
            }
            int i = fhd.c;
            try {
                resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
            } catch (PackageManager.NameNotFoundException unused) {
                resources = null;
            }
            if (resources == null) {
                return null;
            }
            int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", a.ao(str, "Missing resource: "));
                return null;
            }
            String string = resources.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", a.ao(str, "Got empty resource: "));
                return null;
            }
            a.put(str, string);
            return string;
        }
    }
}
