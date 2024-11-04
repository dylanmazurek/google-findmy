package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzv extends op {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ cs d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzv(ViewGroup viewGroup, cs csVar) {
        super(true);
        this.a = viewGroup;
        this.d = csVar;
    }

    @Override // defpackage.op
    public final void b() {
        h(false);
        ArrayList arrayList = cmh.a;
        ViewGroup viewGroup = this.a;
        arrayList.remove(viewGroup);
        ArrayList arrayList2 = (ArrayList) cmh.a().get(viewGroup);
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            int size = arrayList3.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((cmd) arrayList3.get(size)).q(viewGroup);
                }
            }
        }
        this.d.c().d();
    }
}
