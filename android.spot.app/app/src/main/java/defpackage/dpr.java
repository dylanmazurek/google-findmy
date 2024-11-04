package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpr implements dlf, dlc {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public dpr(Bitmap bitmap, dln dlnVar, int i) {
        this.a = i;
        amr.p(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        this.c = dlnVar;
    }

    public static dlf f(Resources resources, dlf dlfVar) {
        if (dlfVar == null) {
            return null;
        }
        return new dpr(resources, dlfVar, 0);
    }

    public static dpr g(Bitmap bitmap, dln dlnVar) {
        if (bitmap == null) {
            return null;
        }
        return new dpr(bitmap, dlnVar, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dlf] */
    @Override // defpackage.dlf
    public final int a() {
        if (this.a != 0) {
            return dtq.a((Bitmap) this.b);
        }
        return this.c.a();
    }

    @Override // defpackage.dlf
    public final Class b() {
        if (this.a != 0) {
            return Bitmap.class;
        }
        return BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dlf] */
    @Override // defpackage.dlf
    public final /* synthetic */ Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new BitmapDrawable((Resources) this.b, (Bitmap) this.c.c());
    }

    @Override // defpackage.dlc
    public final void d() {
        if (this.a != 0) {
            ((Bitmap) this.b).prepareToDraw();
            return;
        }
        Object obj = this.c;
        if (obj instanceof dlc) {
            ((dlc) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, dlf] */
    /* JADX WARN: Type inference failed for: r0v2, types: [dln, java.lang.Object] */
    @Override // defpackage.dlf
    public final void e() {
        if (this.a != 0) {
            this.c.d((Bitmap) this.b);
        } else {
            this.c.e();
        }
    }

    private dpr(Resources resources, dlf dlfVar, int i) {
        this.a = i;
        bsc.q(resources);
        this.b = resources;
        bsc.q(dlfVar);
        this.c = dlfVar;
    }
}
