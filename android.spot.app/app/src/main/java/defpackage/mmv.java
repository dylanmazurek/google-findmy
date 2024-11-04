package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mmv implements Serializable {
    private static final long serialVersionUID = 0;
    private final mnb[] a;

    public mmv(mnb[] mnbVarArr) {
        this.a = mnbVarArr;
    }

    private final Object readResolve() {
        mnb mnbVar = mnc.a;
        int i = 0;
        while (true) {
            mnb[] mnbVarArr = this.a;
            if (i < mnbVarArr.length) {
                mnbVar = mnbVar.plus(mnbVarArr[i]);
                i++;
            } else {
                return mnbVar;
            }
        }
    }
}
