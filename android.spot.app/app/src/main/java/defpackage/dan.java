package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dan extends czw {
    private final Object e;

    public dan(dfe dfeVar) {
        this(dfeVar, null);
    }

    @Override // defpackage.czw
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.czw
    public final Object e() {
        dfe dfeVar = this.d;
        Object obj = this.e;
        float f = this.c;
        return dfeVar.b(0.0f, 0.0f, obj, obj, f, f, f);
    }

    @Override // defpackage.czw
    public final Object f(dfc dfcVar, float f) {
        return e();
    }

    @Override // defpackage.czw
    public final void i() {
        if (this.d != null) {
            super.i();
        }
    }

    @Override // defpackage.czw
    public final void j(float f) {
        this.c = f;
    }

    public dan(dfe dfeVar, Object obj) {
        super(Collections.emptyList());
        k(dfeVar);
        this.e = obj;
    }
}
