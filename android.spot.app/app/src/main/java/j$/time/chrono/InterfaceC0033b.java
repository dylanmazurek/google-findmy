package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;

/* renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0033b extends Temporal, j$.time.temporal.m, Comparable {
    InterfaceC0033b M(long j, TemporalUnit temporalUnit);

    /* renamed from: N */
    int compareTo(InterfaceC0033b interfaceC0033b);

    n a();

    @Override // j$.time.temporal.Temporal
    InterfaceC0033b d(long j, j$.time.temporal.o oVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC0033b e(long j, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.Temporal
    long f(Temporal temporal, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.l
    boolean g(j$.time.temporal.o oVar);

    int hashCode();

    String toString();

    long x();

    InterfaceC0036e z(j$.time.j jVar);
}
