package androidx.work;

import defpackage.cpn;
import defpackage.cpu;
import defpackage.cqn;
import defpackage.eld;
import defpackage.mnb;
import java.util.Collection;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkerParameters {
    public final UUID a;
    public final cpn b;
    public final int c;
    public final Executor d;
    public final mnb e;
    public final cqn f;
    public final cpu g;
    public final eld h;

    public WorkerParameters(UUID uuid, cpn cpnVar, Collection collection, int i, Executor executor, mnb mnbVar, eld eldVar, cqn cqnVar, cpu cpuVar) {
        this.a = uuid;
        this.b = cpnVar;
        new HashSet(collection);
        this.c = i;
        this.d = executor;
        this.e = mnbVar;
        this.h = eldVar;
        this.f = cqnVar;
        this.g = cpuVar;
    }
}
