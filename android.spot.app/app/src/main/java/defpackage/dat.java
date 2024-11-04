package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dat implements agt {
    public final atk f;
    private final adt k;
    private final adt l;
    private final adt m;
    private final agt n;
    private final adt g = new aee(false, agw.a);
    private final adt h = new aee(1, agw.a);
    public final adt a = new aee(1, agw.a);
    public final adt b = new aee(false, agw.a);
    public final adt c = new aee(null, agw.a);
    public final adt d = new aee(Float.valueOf(1.0f), agw.a);
    public final adt e = new aee(false, agw.a);
    private final agt i = new ack(new ctm(this, 3));
    private final adt j = new aee(null, agw.a);

    public dat() {
        Float valueOf = Float.valueOf(0.0f);
        this.k = new aee(valueOf, agw.a);
        this.l = new aee(valueOf, agw.a);
        this.m = new aee(Long.MIN_VALUE, agw.a);
        this.n = new ack(new ctm(this, 2));
        new ack(new ctm(this, 4));
        this.f = new atk((byte[]) null);
    }

    private final float p() {
        return ((Number) this.i.a()).floatValue();
    }

    private final float q() {
        return ((Number) this.k.a()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(long j) {
        this.m.h(Long.valueOf(j));
    }

    @Override // defpackage.agt
    public final /* bridge */ /* synthetic */ Object a() {
        return Float.valueOf(c());
    }

    public final float b() {
        return ((Number) this.n.a()).floatValue();
    }

    public final float c() {
        return ((Number) this.l.a()).floatValue();
    }

    public final float d() {
        return ((Number) this.d.a()).floatValue();
    }

    public final int e() {
        return ((Number) this.h.a()).intValue();
    }

    public final long f() {
        return ((Number) this.m.a()).longValue();
    }

    public final cyb g() {
        return (cyb) this.j.a();
    }

    public final day h() {
        return (day) this.c.a();
    }

    public final void i(cyb cybVar) {
        this.j.h(cybVar);
    }

    public final void j(int i) {
        this.h.h(Integer.valueOf(i));
    }

    public final void k(boolean z) {
        this.g.h(Boolean.valueOf(z));
    }

    public final void l(float f) {
        cyb g;
        this.k.h(Float.valueOf(f));
        if (((Boolean) this.e.a()).booleanValue() && (g = g()) != null) {
            f -= f % (1.0f / g.k);
        }
        this.l.h(Float.valueOf(f));
    }

    public final boolean m() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    public final boolean n(int i, long j) {
        long f;
        float f2;
        float f3;
        float q;
        float f4;
        cyb g = g();
        if (g != null) {
            if (f() == Long.MIN_VALUE) {
                f = 0;
            } else {
                f = j - f();
            }
            r(j);
            day h = h();
            if (h != null) {
                f2 = h.b(g);
            } else {
                f2 = 0.0f;
            }
            day h2 = h();
            if (h2 != null) {
                f3 = h2.a(g);
            } else {
                f3 = 1.0f;
            }
            float a = (((float) (f / 1000000)) / g.a()) * p();
            if (p() < 0.0f) {
                q = f2 - (q() + a);
            } else {
                q = (q() + a) - f3;
            }
            if (q < 0.0f) {
                l(moz.ab(q(), f2, f3) + a);
                return true;
            }
            float f5 = f3 - f2;
            int i2 = (int) (q / f5);
            int i3 = i2 + 1;
            if (e() + i3 > i) {
                l(b());
                j(i);
                return false;
            }
            j(e() + i3);
            float f6 = q - (i2 * f5);
            if (p() < 0.0f) {
                f4 = f3 - f6;
            } else {
                f4 = f2 + f6;
            }
            l(f4);
            return true;
        }
        return true;
    }
}
