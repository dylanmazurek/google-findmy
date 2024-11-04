package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dud extends atq implements afq {
    public final Drawable a;
    public final adt c;
    public final adt b = new aee(0, agw.a);
    private final mkt d = new mla(new ctm(this, 9));

    public dud(Drawable drawable) {
        this.a = drawable;
        this.c = new aee(new aqn(due.a(drawable)), agw.a);
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.atq
    public final long a() {
        return ((aqn) this.c.a()).a;
    }

    @Override // defpackage.atq
    protected final void b(asn asnVar) {
        aqv b = asnVar.n().b();
        g();
        this.a.setBounds(0, 0, mpu.j(aqn.b(asnVar.l())), mpu.j(aqn.a(asnVar.l())));
        try {
            b.e();
            this.a.draw(aqp.a(b));
        } finally {
            b.d();
        }
    }

    @Override // defpackage.afq
    public final void c() {
        this.a.setCallback((Drawable.Callback) this.d.a());
        this.a.setVisible(true, true);
        Object obj = this.a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // defpackage.atq
    protected final void d(ji jiVar) {
        if (jiVar == null) {
            this.a.setColorFilter(null);
            return;
        }
        throw null;
    }

    @Override // defpackage.atq
    protected final void e(bln blnVar) {
        int i;
        blnVar.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            Drawable drawable = this.a;
            int ordinal = blnVar.ordinal();
            if (ordinal != 0) {
                i = 1;
                if (ordinal != 1) {
                    throw new mku();
                }
            } else {
                i = 0;
            }
            drawable.setLayoutDirection(i);
        }
    }

    public final int g() {
        return ((Number) this.b.a()).intValue();
    }

    @Override // defpackage.afq
    public final void h() {
        i();
    }

    @Override // defpackage.afq
    public final void i() {
        Object obj = this.a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.a.setVisible(false, false);
        this.a.setCallback(null);
    }

    @Override // defpackage.atq
    protected final void j(float f) {
        this.a.setAlpha(moz.ae(mpu.j(f * 255.0f), 0, 255));
    }
}
