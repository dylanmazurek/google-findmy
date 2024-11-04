package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmf extends jme implements Serializable {
    public static final jme a = new jmf();
    private static final long serialVersionUID = 0;

    private jmf() {
    }

    @Override // defpackage.jme, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        jmg jmgVar = (jmg) obj;
        jmg jmgVar2 = (jmg) obj2;
        return jhh.b.b(jmgVar.b, jmgVar2.b).b(jmgVar.c, jmgVar2.c).a();
    }
}
