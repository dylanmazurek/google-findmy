package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.adm.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhc {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public nhc(nhg nhgVar, nhd nhdVar, nhr nhrVar) {
        this.b = nhgVar;
        this.c = nhdVar;
        this.d = nhrVar;
        this.e = nhrVar.c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nhr, java.lang.Object] */
    public final ngm a(boolean z) {
        try {
            ngm b = this.d.b(z);
            if (b != null) {
                b.k = this;
            }
            return b;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nhr, java.lang.Object] */
    public final void b() {
        this.d.c().e();
    }

    public final void c() {
        ((nhg) this.b).a(this, true, false, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [nhr, java.lang.Object] */
    public final void d(IOException iOException) {
        this.a = true;
        ((nhd) this.c).a(iOException);
        this.d.c().g((nhg) this.b, iOException);
    }

    public final IOException e(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            d(iOException);
        }
        return ((nhg) this.b).a(this, z2, z, iOException);
    }

    public final Bitmap f(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        jis jisVar = ((hiq) this.e).c;
        if (jisVar != null && !jisVar.isEmpty()) {
            int i = ((jmi) jisVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                if (((hip) jisVar.get(i2)).ordinal() == 0) {
                    Map map = gzm.a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int min = Math.min(width, height);
                    int i3 = min - width;
                    int i4 = min - height;
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    float f = min / 2;
                    canvas.drawCircle(f, f, f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, i3 / 2, i4 / 2, paint);
                    bitmap = createBitmap;
                }
            }
        }
        return bitmap;
    }

    public final void g(Context context) {
        int a;
        Drawable c = cu.c(context, R.drawable.quantum_gm_ic_account_circle_vd_theme_24);
        if (hog.M(context)) {
            a = frx.Y(context, R.attr.colorPrimaryGoogle);
        } else {
            a = hhd.b(context).a(hhb.BLUE);
        }
        j(hog.N(c, a), true);
    }

    public final void h() {
        ijs.c();
        ImageView imageView = (ImageView) ((WeakReference) this.b).get();
        if (!this.a && imageView != null) {
            gzm.b(imageView, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void i(Runnable runnable) {
        if (ijs.g()) {
            this.c.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void j(Drawable drawable, boolean z) {
        ImageView imageView = (ImageView) ((WeakReference) this.b).get();
        if (!this.a && imageView != null) {
            gzl gzlVar = new gzl(this, drawable, z);
            imageView.addOnAttachStateChangeListener(gzlVar);
            int[] iArr = bwn.a;
            if (imageView.isAttachedToWindow()) {
                imageView.post(new gno(gzlVar, imageView, 5));
            }
        }
    }

    public final void k() {
        if (!this.a) {
            ((sl) ((bet) this.d).a).i();
            apc apcVar = (apc) this.e;
            aiu aiuVar = ((aue) apcVar.c).d;
            int i = aiuVar.b;
            if (i > 0) {
                Object[] objArr = aiuVar.a;
                int i2 = 0;
                do {
                    ((aud) objArr[i2]).a();
                    i2++;
                } while (i2 < i);
            }
            apcVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0395 A[Catch: all -> 0x03b9, TryCatch #1 {all -> 0x03b9, blocks: (B:51:0x02ff, B:56:0x0132, B:58:0x014c, B:60:0x0171, B:61:0x019e, B:63:0x01bb, B:65:0x01c3, B:67:0x01cc, B:68:0x01cf, B:76:0x01e4, B:78:0x01ea, B:80:0x0200, B:81:0x020b, B:83:0x0248, B:70:0x01de, B:85:0x0214, B:87:0x022d, B:88:0x023a, B:94:0x0250, B:97:0x0269, B:99:0x027a, B:100:0x027d, B:102:0x0286, B:104:0x028e, B:106:0x02a8, B:107:0x02ac, B:113:0x02ca, B:123:0x02ea, B:125:0x02f8, B:135:0x0308, B:138:0x038a, B:140:0x0395, B:142:0x03a5, B:146:0x03b1, B:151:0x03ad, B:155:0x0331, B:157:0x033e, B:158:0x0342, B:163:0x0352, B:167:0x0359, B:169:0x0366, B:170:0x036a, B:175:0x037a, B:179:0x0380), top: B:55:0x0132 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r1v13, types: [aue] */
    /* JADX WARN: Type inference failed for: r1v55, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, avs] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int l(defpackage.bfi r41, defpackage.baw r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 965
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nhc.l(bfi, baw, boolean):int");
    }

    public nhc(ayr ayrVar) {
        this.c = ayrVar;
        this.e = new apc(ayrVar.s());
        this.d = new bet((short[]) null);
        this.b = new ayf();
    }

    public nhc(Object obj, hiq hiqVar, ImageView imageView, Executor executor) {
        imageView.getClass();
        this.b = new WeakReference(imageView);
        this.e = hiqVar;
        this.d = obj;
        this.c = executor;
    }
}
