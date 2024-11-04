package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dne implements dnp {
    private final /* synthetic */ int a;
    private final Object b;

    public dne(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.dnp
    public final /* synthetic */ boolean a(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return true;
                            }
                            Uri uri = (Uri) obj;
                            if (bpy.f(uri) && bpy.h(uri)) {
                                return true;
                            }
                            return false;
                        }
                        Uri uri2 = (Uri) obj;
                        if (bpy.f(uri2) && !bpy.h(uri2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return bpy.f((Uri) obj);
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [dnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [dnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [dnp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dnc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [dmp, java.lang.Object] */
    @Override // defpackage.dnp
    public final /* synthetic */ bso b(Object obj, int i, int i2, div divVar) {
        Uri uri;
        Long l;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                return this.b.b(new dnf((URL) obj), i, i2, divVar);
                            }
                            Uri uri2 = (Uri) obj;
                            if (!bpy.g(i, i2) || (l = (Long) divVar.b(dqd.a)) == null || l.longValue() != -1) {
                                return null;
                            }
                            dtb dtbVar = new dtb(uri2);
                            Context context = (Context) this.b;
                            return new bso(dtbVar, dnb.b(context, uri2, new djw(context.getContentResolver())));
                        }
                        Uri uri3 = (Uri) obj;
                        if (!bpy.g(i, i2)) {
                            return null;
                        }
                        dtb dtbVar2 = new dtb(uri3);
                        Context context2 = (Context) this.b;
                        return new bso(dtbVar2, dnb.b(context2, uri3, new djv(context2.getContentResolver())));
                    }
                    String str = (String) obj;
                    if (TextUtils.isEmpty(str)) {
                        uri = null;
                    } else if (str.charAt(0) == '/') {
                        uri = c(str);
                    } else {
                        Uri parse = Uri.parse(str);
                        if (parse.getScheme() == null) {
                            uri = c(str);
                        } else {
                            uri = parse;
                        }
                    }
                    if (uri == null || !this.b.a(uri)) {
                        return null;
                    }
                    return this.b.b(uri, i, i2, divVar);
                }
                Uri uri4 = (Uri) obj;
                return new bso(new dtb(uri4), new dnl((Context) this.b, uri4));
            }
            byte[] bArr = (byte[]) obj;
            return new bso(new dtb(bArr), new dmq(bArr, this.b));
        }
        File file = (File) obj;
        return new bso(new dtb(file), new dnb(file, (dnc) this.b, 0));
    }

    public dne(Context context, int i, byte[] bArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }

    public dne(Context context, int i, char[] cArr) {
        this.a = i;
        this.b = context.getApplicationContext();
    }
}
