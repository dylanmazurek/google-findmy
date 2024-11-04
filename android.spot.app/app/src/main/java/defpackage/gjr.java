package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjr extends Exception {
    public gjr(lgd lgdVar) {
        super(String.format(Locale.US, "Fetch disabled for FetchReason [%d].", Integer.valueOf(lgdVar.p)));
    }

    public gjr(lgp lgpVar) {
        super(String.format(Locale.US, "Registration disabled for RegistrationReason [%d].", Integer.valueOf(lgpVar.o)));
    }
}
