package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhb {
    static final lyr a = new lyr("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo", null);
    final Long b;
    final Boolean c;
    final Integer d;
    final Integer e;
    final mjd f;
    final mfi g;

    public mhb(Map map, boolean z, int i, int i2) {
        Map map2;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        mjd mjdVar;
        Map map3;
        boolean z9;
        boolean z10;
        mfi mfiVar;
        boolean z11;
        boolean z12;
        this.b = mfx.d(map, "timeout");
        this.c = mfx.a(map, "waitForReady");
        Integer c = mfx.c(map, "maxResponseMessageBytes");
        this.d = c;
        if (c != null) {
            if (c.intValue() >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            hwx.O(z12, "maxInboundMessageSize %s exceeds bounds", c);
        }
        Integer c2 = mfx.c(map, "maxRequestMessageBytes");
        this.e = c2;
        if (c2 != null) {
            if (c2.intValue() >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hwx.O(z11, "maxOutboundMessageSize %s exceeds bounds", c2);
        }
        if (z) {
            map2 = mfx.i(map, "retryPolicy");
        } else {
            map2 = null;
        }
        if (map2 == null) {
            str = "maxAttempts";
            mjdVar = null;
        } else {
            Integer c3 = mfx.c(map2, "maxAttempts");
            c3.getClass();
            int intValue = c3.intValue();
            if (intValue >= 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            hwx.M(z2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            Long d = mfx.d(map2, "initialBackoff");
            d.getClass();
            long longValue = d.longValue();
            if (longValue > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            hwx.N(z3, "initialBackoffNanos must be greater than 0: %s", longValue);
            Long d2 = mfx.d(map2, "maxBackoff");
            d2.getClass();
            str = "maxAttempts";
            long longValue2 = d2.longValue();
            if (longValue2 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            hwx.N(z4, "maxBackoff must be greater than 0: %s", longValue2);
            Double b = mfx.b(map2, "backoffMultiplier");
            b.getClass();
            double doubleValue = b.doubleValue();
            if (doubleValue > 0.0d) {
                z5 = true;
            } else {
                z5 = false;
            }
            hwx.O(z5, "backoffMultiplier must be greater than 0: %s", b);
            Long d3 = mfx.d(map2, "perAttemptRecvTimeout");
            if (d3 != null && d3.longValue() < 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            hwx.O(z6, "perAttemptRecvTimeout cannot be negative: %s", d3);
            Set k = mjo.k(map2, "retryableStatusCodes");
            if (k != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            hwx.F(z7, "%s is required in retry policy", "retryableStatusCodes");
            hwx.F(!k.contains(mbx.OK), "%s must not contain OK", "retryableStatusCodes");
            if (d3 == null && k.isEmpty()) {
                z8 = false;
            } else {
                z8 = true;
            }
            hwx.K(z8, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            mjdVar = new mjd(min, longValue, longValue2, doubleValue, d3, k);
        }
        this.f = mjdVar;
        if (z) {
            map3 = mfx.i(map, "hedgingPolicy");
        } else {
            map3 = null;
        }
        if (map3 == null) {
            mfiVar = null;
        } else {
            Integer c4 = mfx.c(map3, str);
            c4.getClass();
            int intValue2 = c4.intValue();
            if (intValue2 >= 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            hwx.M(z9, "maxAttempts must be greater than 1: %s", intValue2);
            int min2 = Math.min(intValue2, i2);
            Long d4 = mfx.d(map3, "hedgingDelay");
            d4.getClass();
            long longValue3 = d4.longValue();
            if (longValue3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hwx.N(z10, "hedgingDelay must not be negative: %s", longValue3);
            Set k2 = mjo.k(map3, "nonFatalStatusCodes");
            if (k2 == null) {
                k2 = DesugarCollections.unmodifiableSet(EnumSet.noneOf(mbx.class));
            } else {
                hwx.F(true ^ k2.contains(mbx.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            mfiVar = new mfi(min2, longValue3, k2);
        }
        this.g = mfiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mhb)) {
            return false;
        }
        mhb mhbVar = (mhb) obj;
        if (!amr.g(this.b, mhbVar.b) || !amr.g(this.c, mhbVar.c) || !amr.g(this.d, mhbVar.d) || !amr.g(this.e, mhbVar.e) || !amr.g(this.f, mhbVar.f) || !amr.g(this.g, mhbVar.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("timeoutNanos", this.b);
        q.b("waitForReady", this.c);
        q.b("maxInboundMessageSize", this.d);
        q.b("maxOutboundMessageSize", this.e);
        q.b("retryPolicy", this.f);
        q.b("hedgingPolicy", this.g);
        return q.toString();
    }
}
