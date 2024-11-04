package defpackage;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jnh extends jnp implements jnx {
    /* JADX INFO: Access modifiers changed from: protected */
    public jnh(Level level) {
        super(level);
    }

    @Override // defpackage.jnp
    protected final jra a() {
        return jqy.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [jof] */
    /* JADX WARN: Type inference failed for: r14v10, types: [joi] */
    /* JADX WARN: Type inference failed for: r14v11, types: [jof] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [jof] */
    /* JADX WARN: Type inference failed for: r4v14, types: [jof] */
    @Override // defpackage.jnp
    protected final boolean b(jnt jntVar) {
        int a;
        int i;
        boolean z;
        jng jngVar;
        jnd jndVar;
        ?? r14;
        int i2;
        jpa l = l();
        int b = l.b();
        int i3 = 0;
        while (true) {
            if (i3 >= b) {
                break;
            }
            if (l.c(i3).a == "eye3tag") {
                if (l.d(jnn.a) == null && l.d(jnn.i) == null) {
                    p(jnn.i, jok.SMALL);
                }
            } else {
                i3++;
            }
        }
        jno jnoVar = this.c;
        if (jnoVar != null) {
            if (jntVar != null) {
                long j = this.b;
                jnu jnuVar = jng.a;
                jnf jnfVar = (jnf) jnoVar.d(jnn.d);
                if (jnfVar == null) {
                    jngVar = null;
                } else {
                    jng jngVar2 = (jng) jng.a.b(jntVar, jnoVar);
                    if (j >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jql.f(z, "timestamp cannot be negative");
                    long j2 = jngVar2.b.get();
                    if (j2 >= 0) {
                        long nanos = jnfVar.b.toNanos(jnfVar.a) + j2;
                        if (nanos < 0 || j < nanos) {
                            jngVar = jng.c;
                        }
                    }
                    jngVar2.b.compareAndSet(j2, -j);
                    jngVar = jngVar2;
                }
                jno jnoVar2 = this.c;
                jnu jnuVar2 = jnd.a;
                if (((Integer) jnoVar2.d(jnn.b)) == null) {
                    jndVar = null;
                } else {
                    jnd jndVar2 = (jnd) jnd.a.b(jntVar, jnoVar2);
                    AtomicLong atomicLong = jndVar2.b;
                    jndVar = jndVar2;
                    if (atomicLong.incrementAndGet() < r5.intValue()) {
                        jndVar = jnd.c;
                    }
                }
                jof b2 = jof.b(jngVar, jndVar);
                jno jnoVar3 = this.c;
                jnu jnuVar3 = joi.a;
                Integer num = (Integer) jnoVar3.d(jnn.c);
                if (num != null && num.intValue() > 0) {
                    r14 = (joi) joi.a.b(jntVar, jnoVar3);
                    if (((Random) joi.b.get()).nextInt(num.intValue()) == 0) {
                        i2 = r14.e.incrementAndGet();
                    } else {
                        i2 = r14.e.get();
                    }
                    if (i2 <= 0) {
                        r14 = joi.c;
                    }
                } else {
                    r14 = 0;
                }
                jof b3 = jof.b(b2, r14);
                this.d = b3;
                if (b3 == jof.c) {
                    return false;
                }
            }
            jok jokVar = (jok) this.c.d(jnn.i);
            if (jokVar != null) {
                joa joaVar = jnn.i;
                jno jnoVar4 = this.c;
                if (jnoVar4 != null && (a = jnoVar4.a(joaVar)) >= 0) {
                    int i4 = a + a;
                    int i5 = i4 + 2;
                    while (true) {
                        i = jnoVar4.b;
                        if (i5 >= i + i) {
                            break;
                        }
                        Object obj = jnoVar4.a[i5];
                        if (!obj.equals(joaVar)) {
                            Object[] objArr = jnoVar4.a;
                            objArr[i4] = obj;
                            objArr[i4 + 1] = objArr[i5 + 1];
                            i4 += 2;
                        }
                        i5 += 2;
                    }
                    jnoVar4.b = i - ((i5 - i4) >> 1);
                    while (i4 < i5) {
                        jnoVar4.a[i4] = null;
                        i4++;
                    }
                }
                Throwable th = (Throwable) l().d(jnn.a);
                int i6 = jokVar.f;
                if (i6 <= 0 && i6 != -1) {
                    throw new IllegalArgumentException("invalid maximum depth: 0");
                }
                p(jnn.a, new jnv(th, jokVar, jrd.a.b(jnp.class, i6)));
            }
        }
        return true;
    }
}
