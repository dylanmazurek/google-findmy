package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dog implements dnp {
    private final Context a;
    private final dnp b;
    private final dnp c;
    private final Class d;

    public dog(Context context, dnp dnpVar, dnp dnpVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = dnpVar;
        this.c = dnpVar2;
        this.d = cls;
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && bpy.f(uri)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dnp
    public final /* bridge */ /* synthetic */ bso b(Object obj, int i, int i2, div divVar) {
        Uri uri = (Uri) obj;
        return new bso(new dtb(uri), new dof(this.a, this.b, this.c, uri, i, i2, divVar, this.d));
    }
}
