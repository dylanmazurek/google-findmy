package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.WindowId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkr {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public dkr(View view, String str, cmd cmdVar, WindowId windowId, cmn cmnVar, Animator animator) {
        this.a = view;
        this.e = str;
        this.c = cmnVar;
        this.b = windowId;
        this.f = cmdVar;
        this.d = animator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [bib] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bjm] */
    /* JADX WARN: Type inference failed for: r4v7, types: [bjm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [agt] */
    public final agt a(bjj bjjVar) {
        ?? r4;
        biq biqVar = new biq(this, bjjVar);
        Object obj = this.c;
        bfi bfiVar = (bfi) obj;
        synchronized (bfiVar.b) {
            r4 = (bjm) ((bib) ((bfi) obj).a).b(bjjVar);
            if (r4 != 0) {
                if (!r4.b()) {
                }
            }
            try {
                r4 = biqVar.a(new tn(obj, bjjVar, 17, null));
                synchronized (bfiVar.b) {
                    if (((bib) ((bfi) obj).a).b(bjjVar) == null && r4.b()) {
                        ((bib) ((bfi) obj).a).c(bjjVar, r4);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return r4;
    }

    public final agt b(bip bipVar, biz bizVar) {
        int i = ((bif) this.f).a;
        if (i != 0 && i != Integer.MAX_VALUE) {
            bizVar = new biz(moz.ae(bizVar.g + i, 1, 1000));
        }
        return a(new bjj(bipVar, bizVar));
    }

    public dkr(bym bymVar, bje bjeVar, bfi bfiVar, biu biuVar, bym bymVar2) {
        this.d = bymVar;
        this.f = bjeVar;
        this.c = bfiVar;
        this.a = biuVar;
        this.b = bymVar2;
        this.e = new bco(this, 6);
    }

    public dkr(dmm dmmVar, dmm dmmVar2, dmm dmmVar3, dkt dktVar, dkt dktVar2) {
        this.d = dtx.a(150, new dkq(this, 0));
        this.a = dmmVar;
        this.b = dmmVar2;
        this.c = dmmVar3;
        this.e = dktVar;
        this.f = dktVar2;
    }
}
