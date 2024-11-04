package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iub extends itx {
    public final itz a;
    public final iua b;
    private Drawable c;

    public iub(Context context, itf itfVar, itz itzVar, iua iuaVar) {
        super(context, itfVar);
        this.a = itzVar;
        this.b = iuaVar;
        iuaVar.j = this;
    }

    public static iub a(Context context, itr itrVar) {
        return b(context, itrVar, new itg(itrVar));
    }

    public static iub b(Context context, itr itrVar, itg itgVar) {
        iua itlVar;
        if (itrVar.k == 1) {
            itlVar = new itq(context, itrVar);
        } else {
            itlVar = new itl(itrVar);
        }
        iub iubVar = new iub(context, itrVar, itgVar, itlVar);
        iubVar.c = cny.b(context.getResources(), R.drawable.indeterminate_static, null);
        return iubVar;
    }

    private final boolean c() {
        if (this.n == null || hzc.r(this.h.getContentResolver()) != 0.0f) {
            return false;
        }
        return true;
    }

    @Override // defpackage.itx
    public final boolean d(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean d = super.d(z, z2, z3);
        if (c() && (drawable = this.c) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.b.a();
        }
        if (z && (z3 || (Build.VERSION.SDK_INT <= 22 && !c()))) {
            this.b.d();
        }
        return d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2;
        Drawable drawable;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (c() && (drawable = this.c) != null) {
                drawable.setBounds(getBounds());
                bsc.f(this.c, this.i.c[0]);
                this.c.draw(canvas);
                return;
            }
            canvas.save();
            this.a.h(canvas, getBounds(), e(), j(), i());
            itf itfVar = this.i;
            int i = itfVar.g;
            int i2 = this.m;
            if (!(itfVar instanceof iuk) && (!(itfVar instanceof itr) || !((itr) itfVar).o)) {
                z = false;
            } else {
                z = true;
            }
            if (z && i == 0) {
                if (!itfVar.b()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                i = 0;
            } else {
                z2 = false;
            }
            if (z2) {
                this.a.f(canvas, this.l, 0.0f, 1.0f, this.i.d, i2, 0);
            } else if (z) {
                ity ityVar = (ity) this.b.k.get(0);
                ity ityVar2 = (ity) this.b.k.get(r4.size() - 1);
                itz itzVar = this.a;
                if (itzVar instanceof iuc) {
                    int i3 = i;
                    itzVar.f(canvas, this.l, 0.0f, ityVar.a, this.i.d, i2, i3);
                    this.a.f(canvas, this.l, ityVar2.b, 1.0f, this.i.d, i2, i3);
                } else {
                    canvas.save();
                    canvas.rotate(ityVar2.g);
                    this.a.f(canvas, this.l, ityVar2.b, 1.0f + ityVar.a, this.i.d, i2, i);
                    canvas.restore();
                }
            }
            for (int i4 = 0; i4 < this.b.k.size(); i4++) {
                ity ityVar3 = (ity) this.b.k.get(i4);
                ityVar3.f = f();
                this.a.e(canvas, this.l, ityVar3, this.m);
                if (i4 > 0 && !z2 && z) {
                    this.a.f(canvas, this.l, ((ity) this.b.k.get(i4 - 1)).b, ityVar3.a, this.i.d, i2, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.itx, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }
}
