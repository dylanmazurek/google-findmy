package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqq extends dqi implements dlc {
    public dqq(dqo dqoVar) {
        super(dqoVar);
    }

    @Override // defpackage.dlf
    public final int a() {
        dqu dquVar = ((dqo) this.a).a.a;
        dhq dhqVar = (dhq) dquVar.a;
        return dhqVar.a.limit() + dhqVar.c.length + (dhqVar.d.length * 4) + dquVar.j;
    }

    @Override // defpackage.dlf
    public final Class b() {
        return dqo.class;
    }

    @Override // defpackage.dqi, defpackage.dlc
    public final void d() {
        ((dqo) this.a).a().prepareToDraw();
    }

    @Override // defpackage.dlf
    public final void e() {
        ((dqo) this.a).stop();
        dqo dqoVar = (dqo) this.a;
        dqoVar.b = true;
        dqu dquVar = dqoVar.a.a;
        dquVar.b.clear();
        dquVar.d();
        dquVar.f();
        dqs dqsVar = dquVar.e;
        if (dqsVar != null) {
            dquVar.c.g(dqsVar);
            dquVar.e = null;
        }
        dqs dqsVar2 = dquVar.g;
        if (dqsVar2 != null) {
            dquVar.c.g(dqsVar2);
            dquVar.g = null;
        }
        dqs dqsVar3 = dquVar.i;
        if (dqsVar3 != null) {
            dquVar.c.g(dqsVar3);
            dquVar.i = null;
        }
        dhq dhqVar = (dhq) dquVar.a;
        dhqVar.f = null;
        byte[] bArr = dhqVar.c;
        if (bArr != null) {
            dhqVar.j.o(bArr);
        }
        int[] iArr = dhqVar.d;
        if (iArr != null) {
            ((dlu) dhqVar.j.a).c(iArr);
        }
        Bitmap bitmap = dhqVar.g;
        if (bitmap != null) {
            dhqVar.j.n(bitmap);
        }
        dhqVar.g = null;
        dhqVar.a = null;
        dhqVar.h = null;
        byte[] bArr2 = dhqVar.b;
        if (bArr2 != null) {
            dhqVar.j.o(bArr2);
        }
        dquVar.f = true;
    }
}
