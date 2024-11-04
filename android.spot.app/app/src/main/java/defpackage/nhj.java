package defpackage;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nhj extends ngv {
    final /* synthetic */ nhk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhj(nhk nhkVar, String str) {
        super(str);
        this.d = nhkVar;
    }

    @Override // defpackage.ngv
    public final long a() {
        long nanoTime = System.nanoTime();
        nhk nhkVar = this.d;
        Iterator it = ((ConcurrentLinkedQueue) nhkVar.d).iterator();
        long j = Long.MIN_VALUE;
        nhi nhiVar = null;
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            nhi nhiVar2 = (nhi) it.next();
            nhiVar2.getClass();
            synchronized (nhiVar2) {
                byte[] bArr = ngt.a;
                List list = nhiVar2.l;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference reference = (Reference) list.get(i3);
                        if (reference.get() != null) {
                            i3++;
                        } else {
                            reference.getClass();
                            nju.b.f("A connection to " + nhiVar2.a.a.h + " was leaked. Did you forget to close a response body?", ((nhe) reference).a);
                            list.remove(i3);
                            nhiVar2.k();
                            if (list.isEmpty()) {
                                nhiVar2.m = nanoTime - nhkVar.a;
                                break;
                            }
                        }
                    } else if (list.size() > 0) {
                        i2++;
                    }
                }
                i++;
                long j2 = nanoTime - nhiVar2.m;
                if (j2 > j) {
                    j = j2;
                }
                if (j2 > j) {
                    nhiVar = nhiVar2;
                }
            }
        }
        long j3 = nhkVar.a;
        if (j < j3 && i <= 5) {
            if (i > 0) {
                return j3 - j;
            }
            if (i2 <= 0) {
                return -1L;
            }
            return j3;
        }
        nhiVar.getClass();
        synchronized (nhiVar) {
            if (!nhiVar.l.isEmpty()) {
                return 0L;
            }
            if (nhiVar.m + j != nanoTime) {
                return 0L;
            }
            nhiVar.k();
            ((ConcurrentLinkedQueue) nhkVar.d).remove(nhiVar);
            ngt.p(nhiVar.a());
            if (!((ConcurrentLinkedQueue) nhkVar.d).isEmpty()) {
                return 0L;
            }
            ((ngx) nhkVar.b).a();
            return 0L;
        }
    }
}
