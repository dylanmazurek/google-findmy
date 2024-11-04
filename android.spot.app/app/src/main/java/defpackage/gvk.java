package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvk extends Enum {
    public static final gvk a;
    public static final gvk b;
    public static final gvk c;
    public static final gvk d;
    public static final gvk e;
    public static final gvk f;
    private static final /* synthetic */ gvk[] g;

    static {
        gvk gvkVar = new gvk("DEFAULT", 0);
        a = gvkVar;
        gvk gvkVar2 = new gvk("TV", 1);
        b = gvkVar2;
        gvk gvkVar3 = new gvk("WEARABLE", 2);
        c = gvkVar3;
        gvk gvkVar4 = new gvk("AUTOMOTIVE", 3);
        d = gvkVar4;
        gvk gvkVar5 = new gvk("BATTLESTAR", 4);
        e = gvkVar5;
        gvk gvkVar6 = new gvk("CHROME_OS", 5);
        f = gvkVar6;
        gvk[] gvkVarArr = {gvkVar, gvkVar2, gvkVar3, gvkVar4, gvkVar5, gvkVar6};
        g = gvkVarArr;
        mjo.t(gvkVarArr);
    }

    private gvk(String str, int i) {
        super(str, i);
    }

    public static gvk[] values() {
        return (gvk[]) g.clone();
    }
}
