package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmz implements dnp {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public dmz(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Uri c(Integer num) {
        try {
            return Uri.parse("android.resource://" + ((Resources) this.b).getResourcePackageName(num.intValue()) + "/" + ((Resources) this.b).getResourceTypeName(num.intValue()) + "/" + ((Resources) this.b).getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Objects.toString(num);
                Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
                return null;
            }
            return null;
        }
    }

    @Override // defpackage.dnp
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Uri uri = (Uri) obj;
                    if ("android.resource".equals(uri.getScheme()) && ((Context) this.b).getPackageName().equals(uri.getAuthority())) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            Uri uri2 = (Uri) obj;
            if ("file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0))) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [dnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [dnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v16, types: [dnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4, types: [dmn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dmy, java.lang.Object] */
    @Override // defpackage.dnp
    public final /* synthetic */ bso b(Object obj, int i, int i2, div divVar) {
        Resources resources;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                bso bsoVar = null;
                if (i3 != 2) {
                    Uri uri = (Uri) obj;
                    List<String> pathSegments = uri.getPathSegments();
                    if (pathSegments.size() == 1) {
                        try {
                            int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                            if (parseInt == 0) {
                                if (Log.isLoggable("ResourceUriLoader", 5)) {
                                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + String.valueOf(uri));
                                }
                            } else {
                                bsoVar = this.c.b(Integer.valueOf(parseInt), i, i2, divVar);
                            }
                            return bsoVar;
                        } catch (NumberFormatException e) {
                            if (Log.isLoggable("ResourceUriLoader", 5)) {
                                Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri))), e);
                                return bsoVar;
                            }
                            return bsoVar;
                        }
                    }
                    if (pathSegments.size() == 2) {
                        List<String> pathSegments2 = uri.getPathSegments();
                        String str = pathSegments2.get(0);
                        String str2 = pathSegments2.get(1);
                        Context context = (Context) this.b;
                        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                        if (identifier == 0) {
                            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                                return null;
                            }
                            Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
                            return null;
                        }
                        return this.c.b(Integer.valueOf(identifier), i, i2, divVar);
                    }
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri))));
                    return null;
                }
                Uri c = c((Integer) obj);
                if (c == null) {
                    return null;
                }
                return this.c.b(c, i, i2, divVar);
            }
            Uri uri2 = (Uri) obj;
            return new bso(new dtb(uri2), this.c.a((AssetManager) this.b, uri2.toString().substring(22)));
        }
        Integer num = (Integer) obj;
        Resources.Theme theme = (Resources.Theme) divVar.b(dqk.a);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = ((Context) this.b).getResources();
        }
        return new bso(new dtb(num), new dmx(theme, resources, this.c, num.intValue()));
    }

    public dmz(Context context, dmy dmyVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = dmyVar;
    }

    public dmz(Context context, dnp dnpVar, int i) {
        this.a = i;
        this.b = context.getApplicationContext();
        this.c = dnpVar;
    }
}
