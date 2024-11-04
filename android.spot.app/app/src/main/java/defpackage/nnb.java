package defpackage;

import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnb extends NetworkException {
    protected final int a;
    protected final int b;

    public nnb() {
        super("Network bound to request not found", null);
        this.a = 9;
        this.b = -4;
    }

    @Override // org.chromium.net.NetworkException
    public final int getCronetInternalErrorCode() {
        return this.b;
    }

    @Override // org.chromium.net.NetworkException
    public final int getErrorCode() {
        return this.a;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        boolean z;
        StringBuilder sb = new StringBuilder(super.getMessage());
        sb.append(", ErrorCode=");
        sb.append(this.a);
        if (this.b != 0) {
            sb.append(", InternalErrorCode=");
            sb.append(this.b);
        }
        sb.append(", Retryable=");
        int i = this.a;
        if (i != 3 && i != 4 && i != 5 && i != 6 && i != 8) {
            z = false;
        } else {
            z = true;
        }
        sb.append(z);
        return sb.toString();
    }

    @Override // org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.a;
        if (i != 3 && i != 4 && i != 5 && i != 6 && i != 8) {
            return false;
        }
        return true;
    }
}
