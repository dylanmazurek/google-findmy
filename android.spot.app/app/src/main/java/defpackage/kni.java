package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kni implements knw {
    private final /* synthetic */ int i;
    public static final kni h = new kni(7);
    public static final kni g = new kni(6);
    public static final kni f = new kni(5);
    public static final kni e = new kni(4);
    public static final kni d = new kni(3);
    public static final kni c = new kni(2);
    public static final kni b = new kni(1);
    public static final kni a = new kni(0);

    public kni(int i) {
        this.i = i;
    }

    @Override // defpackage.knw
    public final /* synthetic */ Object a(knv knvVar) {
        switch (this.i) {
            case 0:
                Object d2 = knvVar.d(new kon(knq.class, Executor.class));
                d2.getClass();
                return mkm.aH((Executor) d2);
            case 1:
                Object d3 = knvVar.d(new kon(kno.class, Executor.class));
                d3.getClass();
                return mkm.aH((Executor) d3);
            case 2:
                Object d4 = knvVar.d(new kon(knp.class, Executor.class));
                d4.getClass();
                return mkm.aH((Executor) d4);
            case 3:
                Object d5 = knvVar.d(new kon(knr.class, Executor.class));
                d5.getClass();
                return mkm.aH((Executor) d5);
            case 4:
                Object d6 = knvVar.d(new kon(kno.class, Executor.class));
                d6.getClass();
                return mkm.aH((Executor) d6);
            case 5:
                Object d7 = knvVar.d(new kon(knq.class, Executor.class));
                d7.getClass();
                return mkm.aH((Executor) d7);
            case 6:
                Object d8 = knvVar.d(new kon(knp.class, Executor.class));
                d8.getClass();
                return mkm.aH((Executor) d8);
            default:
                Object d9 = knvVar.d(new kon(knr.class, Executor.class));
                d9.getClass();
                return mkm.aH((Executor) d9);
        }
    }
}
