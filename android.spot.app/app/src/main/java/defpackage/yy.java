package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yy {
    public static final yy a = new yy(null, null);
    public final avs b;
    public final bgk c;

    public yy(avs avsVar, bgk bgkVar) {
        this.b = avsVar;
        this.c = bgkVar;
    }

    public static /* synthetic */ yy a(yy yyVar, avs avsVar, bgk bgkVar, int i) {
        if ((i & 1) != 0) {
            avsVar = yyVar.b;
        }
        if ((i & 2) != 0) {
            bgkVar = yyVar.c;
        }
        return new yy(avsVar, bgkVar);
    }
}
