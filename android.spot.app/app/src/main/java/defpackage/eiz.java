package defpackage;

import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eiz implements IntFunction {
    public final /* synthetic */ ljn a;
    private final /* synthetic */ int b;

    public /* synthetic */ eiz(ljn ljnVar, int i) {
        this.b = i;
        this.a = ljnVar;
    }

    @Override // java.util.function.IntFunction
    public final Object apply(int i) {
        if (this.b != 0) {
            lqq lqqVar = (lqq) this.a;
            return new iif((kym) lqqVar.a.get(i), (lln) lqqVar.b.get(i));
        }
        jnk jnkVar = ejg.a;
        kzb kzbVar = (kzb) this.a;
        return new iif((kym) kzbVar.d.get(i), (lln) kzbVar.e.get(i));
    }
}
