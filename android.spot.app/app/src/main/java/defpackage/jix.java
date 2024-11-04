package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jix implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public jix(jiy jiyVar) {
        Object[] objArr = new Object[jiyVar.size()];
        Object[] objArr2 = new Object[jiyVar.size()];
        jmw listIterator = jiyVar.entrySet().listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    final Object readResolve() {
        Object obj = this.a;
        if (!(obj instanceof jjr)) {
            Object obj2 = this.b;
            Object[] objArr = (Object[]) obj;
            jiu jiuVar = new jiu(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                jiuVar.d(objArr[i], ((Object[]) obj2)[i]);
            }
            return jiuVar.b();
        }
        jjr jjrVar = (jjr) obj;
        jih jihVar = (jih) this.b;
        jiu jiuVar2 = new jiu(jjrVar.size());
        jmw listIterator = jjrVar.listIterator();
        jmw listIterator2 = jihVar.listIterator();
        while (listIterator.hasNext()) {
            jiuVar2.d(listIterator.next(), listIterator2.next());
        }
        return jiuVar2.b();
    }
}
