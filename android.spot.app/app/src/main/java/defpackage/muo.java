package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muo {
    public static final nbj a = new nbj("COMPLETING_ALREADY");
    public static final nbj b = new nbj("COMPLETING_WAITING_CHILDREN");
    public static final nbj c = new nbj("COMPLETING_RETRY");
    public static final nbj d = new nbj("TOO_LATE_TO_CANCEL");
    public static final nbj e = new nbj("SEALED");
    public static final mtn f = new mtn(false);
    public static final mtn g = new mtn(true);

    public static final Object a(Object obj) {
        if (obj instanceof mtz) {
            return new mua((mtz) obj);
        }
        return obj;
    }

    public static final Object b(Object obj) {
        mua muaVar;
        mtz mtzVar;
        if (obj instanceof mua) {
            muaVar = (mua) obj;
        } else {
            muaVar = null;
        }
        if (muaVar != null && (mtzVar = muaVar.a) != null) {
            return mtzVar;
        }
        return obj;
    }
}
