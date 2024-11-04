package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqk implements dix {
    public static final diu a = new diu("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", null, diu.a);
    private final Context b;

    public dqk(Context context) {
        this.b = context.getApplicationContext();
    }

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ dlf a(Object obj, int i, int i2, div divVar) {
        return c((Uri) obj, divVar);
    }

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ boolean b(Object obj, div divVar) {
        String scheme = ((Uri) obj).getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }

    public final dlf c(Uri uri, div divVar) {
        Context context;
        int parseInt;
        Resources.Theme theme;
        Drawable a2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            if (authority.equals(this.b.getPackageName())) {
                context = this.b;
            } else {
                try {
                    context = this.b.createPackageContext(authority, 0);
                } catch (PackageManager.NameNotFoundException e) {
                    if (authority.contains(this.b.getPackageName())) {
                        context = this.b;
                    } else {
                        throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(String.valueOf(uri))), e);
                    }
                }
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                List<String> pathSegments2 = uri.getPathSegments();
                String authority2 = uri.getAuthority();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                parseInt = context.getResources().getIdentifier(str2, str, authority2);
                if (parseInt == 0) {
                    parseInt = Resources.getSystem().getIdentifier(str2, str, "android");
                }
                if (parseInt == 0) {
                    throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
                }
            } else if (pathSegments.size() == 1) {
                try {
                    parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                } catch (NumberFormatException e2) {
                    throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))), e2);
                }
            } else {
                throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(String.valueOf(uri))));
            }
            bsc.q(authority);
            if (authority.equals(this.b.getPackageName())) {
                theme = (Resources.Theme) divVar.b(a);
            } else {
                theme = null;
            }
            if (theme == null) {
                a2 = dqh.a(this.b, context, parseInt, null);
            } else {
                Context context2 = this.b;
                a2 = dqh.a(context2, context2, parseInt, theme);
            }
            return dqj.g(a2);
        }
        throw new IllegalStateException(der.b(uri, "Package name for ", " is null or empty"));
    }
}
