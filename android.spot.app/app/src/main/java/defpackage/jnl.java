package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jnl extends joa {
    public jnl(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.joa
    public final void a(Iterator it, jnz jnzVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                jnzVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            jnzVar.a(str, sb.toString());
        }
    }
}
