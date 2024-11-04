package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icn implements icm {
    public static final /* synthetic */ int c = 0;
    public final icv a;
    public final jzd b;

    static {
        lim.B("01");
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [mko, java.lang.Object] */
    public icn(idt idtVar, hot hotVar, hot hotVar2, hot hotVar3, jzd jzdVar) {
        ict a = icu.a();
        a.b(hotVar3.k());
        a.c(true);
        this.a = hotVar.m(idtVar, a.a());
        ((jzd) hotVar2.a.a()).getClass();
        jer a2 = idtVar.a(UUID.fromString(idy.a));
        hqk.j(a2, idy.c);
        hqk.j(a2, idy.b);
        this.b = jzdVar;
    }

    public static jyz a(lim limVar) {
        return ivc.D(new iea("Invalid response size " + limVar.d()));
    }
}
