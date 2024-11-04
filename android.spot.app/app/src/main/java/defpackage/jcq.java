package defpackage;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.InstallActivity;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jcq {
    boolean a = false;
    final /* synthetic */ InstallActivity b;

    public jcq(InstallActivity installActivity) {
        this.b = installActivity;
    }

    public final void a(jcr jcrVar) {
        boolean z;
        synchronized (this.b) {
            if (!this.a) {
                this.b.lastEvent = jcrVar;
                ArCoreApk.UserMessageType userMessageType = ArCoreApk.UserMessageType.APPLICATION;
                ArCoreApk.Availability availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                int ordinal = jcrVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.b.finishWithFailure(new UnavailableUserDeclinedInstallationException());
                    } else if (ordinal == 2) {
                        z = this.b.waitingForCompletion;
                        if (!z && jci.a.e) {
                            this.b.closeInstaller();
                        }
                        this.b.finishWithFailure(null);
                    }
                    this.a = true;
                }
            }
        }
    }

    public final void b(Exception exc) {
        synchronized (this.b) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.b.lastEvent = jcr.CANCELLED;
            this.b.finishWithFailure(exc);
        }
    }
}
