package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxq extends jwx {
    private List b;

    public jxq(jih jihVar, boolean z) {
        super(jihVar, z, true);
        List I;
        if (jihVar.isEmpty()) {
            I = Collections.emptyList();
        } else {
            I = hzc.I(jihVar.size());
        }
        for (int i = 0; i < jihVar.size(); i++) {
            I.add(null);
        }
        this.b = I;
        q();
    }

    @Override // defpackage.jwx
    public final void f(int i, Object obj) {
        List list = this.b;
        if (list != null) {
            list.set(i, new jck(obj));
        }
    }

    @Override // defpackage.jwx
    public final void h() {
        Object obj;
        List<jck> list = this.b;
        if (list != null) {
            ArrayList I = hzc.I(list.size());
            for (jck jckVar : list) {
                if (jckVar != null) {
                    obj = jckVar.a;
                } else {
                    obj = null;
                }
                I.add(obj);
            }
            d(DesugarCollections.unmodifiableList(I));
        }
    }

    @Override // defpackage.jwx
    public final void s(int i) {
        super.s(i);
        this.b = null;
    }
}
