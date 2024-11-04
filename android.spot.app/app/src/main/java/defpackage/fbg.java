package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fbg {
    public final fbm g;
    public final fbd h;
    public final List i;

    public fbg(fbm fbmVar, flt fltVar) {
        fma.aR(fbmVar);
        this.g = fbmVar;
        this.i = new ArrayList();
        fbd fbdVar = new fbd(this, fltVar);
        fbdVar.f = true;
        this.h = fbdVar;
    }

    public void a(fbd fbdVar) {
        throw null;
    }

    public final List b() {
        return this.h.h;
    }
}
