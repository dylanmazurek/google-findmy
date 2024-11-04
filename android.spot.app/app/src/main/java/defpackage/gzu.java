package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzu extends AnimatorListenerAdapter {
    final /* synthetic */ gzn a;
    final /* synthetic */ gzy b;

    public gzu(gzy gzyVar, gzn gznVar) {
        this.a = gznVar;
        this.b = gzyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        gzy gzyVar = this.b;
        gbm gbmVar = null;
        gzyVar.d = null;
        if (this.a != null) {
            switch (r1.c - 1) {
                case 0:
                    i = 8;
                    break;
                case 1:
                    i = 5;
                    break;
                case 2:
                    i = 6;
                    break;
                case 3:
                    i = 9;
                    break;
                case 4:
                    i = 10;
                    break;
                case 5:
                    i = 11;
                    break;
                case 6:
                    i = 12;
                    break;
                default:
                    i = 7;
                    break;
            }
            nqe nqeVar = hjm.a;
            ljh k = hjo.c.k();
            ljh k2 = jus.e.k();
            ljh k3 = juq.c.k();
            if (!k3.b.y()) {
                k3.t();
            }
            juq juqVar = (juq) k3.b;
            juqVar.b = i - 1;
            juqVar.a |= 1;
            juq juqVar2 = (juq) k3.q();
            if (!k2.b.y()) {
                k2.t();
            }
            jus jusVar = (jus) k2.b;
            juqVar2.getClass();
            jusVar.b = juqVar2;
            jusVar.a |= 2;
            jus jusVar2 = (jus) k2.q();
            if (!k.b.y()) {
                k.t();
            }
            hjo hjoVar = (hjo) k.b;
            jusVar2.getClass();
            hjoVar.b = jusVar2;
            hjoVar.a |= 1;
            gbmVar = new gbm(nqeVar, (hjo) k.q());
        }
        gzyVar.e = gbmVar;
        hjp hjpVar = gzyVar.c;
        if (hjpVar == null) {
            return;
        }
        gzyVar.a.cU(hjpVar);
        gbm gbmVar2 = gzyVar.e;
        if (gbmVar2 != null) {
            gzyVar.a.c(gzyVar.c, gbmVar2);
        } else {
            gzyVar.a.b(gzyVar.c);
        }
    }
}
