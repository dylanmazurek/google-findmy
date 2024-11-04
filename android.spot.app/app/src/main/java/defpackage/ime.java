package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ime implements jxc {
    public List a;
    public final /* synthetic */ imf b;

    public ime(imf imfVar) {
        this.b = imfVar;
    }

    @Override // defpackage.jxc
    public final jyz a() {
        jax i = iqh.i("Initialize ".concat(String.valueOf(this.b.a)));
        try {
            synchronized (this.b.d) {
                if (this.a == null) {
                    imf imfVar = this.b;
                    this.a = imfVar.e;
                    imfVar.e = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.a.size());
            njz njzVar = new njz(this.b, null);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((jxd) it.next()).a(njzVar));
                } catch (Exception e) {
                    arrayList.add(ivc.D(e));
                }
            }
            jyz a = ivc.S(arrayList).a(new csf(this, 20), jxv.a);
            i.a(a);
            i.close();
            return a;
        } catch (Throwable th) {
            try {
                i.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
