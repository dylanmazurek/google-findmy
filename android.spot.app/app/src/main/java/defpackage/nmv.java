package defpackage;

import j$.time.Duration;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nmv implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nmv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map emptyMap;
        String str;
        int i;
        long j;
        Iterator it;
        long j2;
        int i2;
        int i3;
        if (this.b != 0) {
            Object obj = this.a;
            try {
                Object obj2 = ((nmu) obj).d;
                nmg nmgVar = ((nmx) obj2).t;
                long j3 = ((nmx) obj2).s;
                nnf nnfVar = ((nmx) obj2).o;
                if (nnfVar != null) {
                    emptyMap = nnfVar.getAllHeaders();
                    nnf nnfVar2 = ((nmx) ((nmu) obj).d).o;
                    String str2 = nnfVar2.b;
                    i = nnfVar2.a;
                    str = str2;
                } else {
                    emptyMap = Collections.emptyMap();
                    str = "";
                    i = 0;
                }
                long j4 = 0;
                for (Map.Entry entry : ((nmx) ((nmu) obj).d).e.entrySet()) {
                    if (((String) entry.getKey()) != null) {
                        j4 += r14.length();
                    }
                    if (((String) entry.getValue()) != null) {
                        j4 += r9.length();
                    }
                }
                if (emptyMap == null) {
                    j = 0;
                } else {
                    long j5 = 0;
                    for (Iterator it2 = emptyMap.entrySet().iterator(); it2.hasNext(); it2 = it) {
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        if (((String) entry2.getKey()) != null) {
                            it = it2;
                            j5 += r14.length();
                        } else {
                            it = it2;
                        }
                        if (entry2.getValue() != null) {
                            Iterator it3 = ((List) entry2.getValue()).iterator();
                            while (it3.hasNext()) {
                                if (((String) it3.next()) != null) {
                                    j5 += r8.length();
                                }
                            }
                        }
                    }
                    j = j5;
                }
                if (emptyMap.containsKey("Content-Length")) {
                    try {
                        j2 = Long.parseLong((String) ((List) emptyMap.get("Content-Length")).get(0));
                    } catch (NumberFormatException unused) {
                        j2 = 0;
                    }
                } else {
                    j2 = -1;
                }
                long j6 = j2;
                Duration ofSeconds = Duration.ofSeconds(0L);
                Duration ofSeconds2 = Duration.ofSeconds(0L);
                int i4 = ((nmx) ((nmu) obj).d).g.get();
                if (i4 != 6) {
                    if (i4 != 7) {
                        if (i4 == 8) {
                            i2 = 3;
                        } else {
                            throw new IllegalStateException(a.am(i4, "Internal Cronet error: attempted to report metrics but current state (", ") is not a done state!"));
                        }
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 2;
                }
                Object obj3 = ((nmu) obj).d;
                int i5 = ((nmx) obj3).w;
                int i6 = ((nmx) obj3).v;
                nmp nmpVar = ((nmx) obj3).y;
                if (nmpVar == null) {
                    i3 = 0;
                } else {
                    i3 = nmpVar.g;
                }
                nmgVar.d(j3, new nme(j4, j, j6, i, ofSeconds, ofSeconds2, str, i2, i5, i6, i3, ((nmx) obj3).x));
                return;
            } catch (RuntimeException unused2) {
                String str3 = nmx.a;
                return;
            }
        }
        ((nmw) this.a).a();
    }
}
