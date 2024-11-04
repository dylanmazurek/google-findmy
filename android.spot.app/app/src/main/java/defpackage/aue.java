package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aue {
    public final aiu d = new aiu(new aud[16]);

    public boolean c(sl slVar, avs avsVar, bfi bfiVar, boolean z) {
        aiu aiuVar = this.d;
        int i = aiuVar.b;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = aiuVar.a;
        int i2 = 0;
        boolean z2 = false;
        do {
            if (!((aud) objArr[i2]).c(slVar, avsVar, bfiVar, z) && !z2) {
                z2 = false;
            } else {
                z2 = true;
            }
            i2++;
        } while (i2 < i);
        return z2;
    }

    public final void f() {
        int i = 0;
        while (true) {
            aiu aiuVar = this.d;
            if (i < aiuVar.b) {
                aud audVar = (aud) aiuVar.a[i];
                if (!audVar.a.t) {
                    audVar.a();
                    this.d.b(i);
                } else {
                    audVar.f();
                    i++;
                }
            } else {
                return;
            }
        }
    }

    public final void g() {
        int i = this.d.b;
        while (true) {
            i--;
            if (i >= 0) {
                aiu aiuVar = this.d;
                if (((aud) aiuVar.a[i]).c.a == 0) {
                    aiuVar.b(i);
                }
            } else {
                return;
            }
        }
    }
}
