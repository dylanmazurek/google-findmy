package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adl {
    public static final adk a(mnb mnbVar) {
        adk adkVar = (adk) mnbVar.get(adk.e);
        if (adkVar != null) {
            return adkVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(moh mohVar, mmx mmxVar) {
        return a(mmxVar.o()).a(mohVar, mmxVar);
    }
}
