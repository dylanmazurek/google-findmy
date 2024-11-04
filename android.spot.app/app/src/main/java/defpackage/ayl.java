package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayl implements awi {
    private final /* synthetic */ awi a;
    private final int b;
    private final int c;

    public ayl(awi awiVar, aym aymVar) {
        this.a = awiVar;
        azd azdVar = aymVar.h;
        azdVar.getClass();
        this.b = azdVar.a;
        azdVar.getClass();
        this.c = azdVar.b;
    }

    @Override // defpackage.awi
    public final int a() {
        return this.c;
    }

    @Override // defpackage.awi
    public final int b() {
        return this.b;
    }

    @Override // defpackage.awi
    public final Map c() {
        return this.a.c();
    }

    @Override // defpackage.awi
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.awi
    public final void e() {
        this.a.e();
    }
}
