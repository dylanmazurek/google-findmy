package defpackage;

import android.content.Context;
import android.util.ArrayMap;
import android.view.FrameMetrics;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqu implements Window.OnFrameMetricsAvailableListener {
    private boolean a;
    private long b;
    private hre c;
    private final ArrayMap d;
    private final jfe e;
    private final mko f;

    public hqu(Context context, ArrayMap arrayMap, mko mkoVar) {
        this.e = hwx.H(new hnn(context, 5));
        this.d = arrayMap;
        this.f = mkoVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        long metric2;
        long j;
        long metric3;
        int i2;
        int i3;
        int i4;
        hre hreVar;
        if (!this.a) {
            this.a = true;
            if (hre.b()) {
                hreVar = new hre();
            } else {
                hreVar = null;
            }
            this.c = hreVar;
            if (this.f.a() != null && ((Boolean) this.f.a()).booleanValue()) {
                this.b = 1.0E9f / window.getWindowManager().getDefaultDisplay().getRefreshRate();
            } else {
                this.b = ((Long) this.e.a()).longValue();
            }
        }
        metric = frameMetrics.getMetric(9);
        if (metric != 1) {
            metric2 = frameMetrics.getMetric(8);
            hre hreVar2 = this.c;
            if (hreVar2 != null) {
                j = hreVar2.a(frameMetrics, this.b);
            } else {
                j = this.b;
            }
            metric3 = frameMetrics.getMetric(13);
            ArrayMap arrayMap = this.d;
            synchronized (arrayMap) {
                int size = arrayMap.size();
                int i5 = 0;
                while (i5 < size) {
                    hqy hqyVar = (hqy) arrayMap.valueAt(i5);
                    int i6 = i5;
                    int i7 = (int) (metric2 / 1000000);
                    if (i7 < 0) {
                        ((jni) ((jni) hmz.a.d()).j("com/google/android/libraries/performance/primes/metrics/jank/FrameTimeHistogram", "addFrame", 84, "FrameTimeHistogram.java")).t("Invalid frame time: %d", metric2);
                        hqyVar.i++;
                    } else {
                        hqyVar.h++;
                        if (metric3 > 0) {
                            i2 = i7;
                            int i8 = (int) ((metric2 - metric3) / 1000000);
                            if (hqyVar.n < i8) {
                                hqyVar.n = i8;
                            }
                            int[] iArr = hqyVar.e;
                            if (i8 < 20) {
                                if (i8 >= -20) {
                                    i4 = ((i8 + 20) >> 1) + 12;
                                } else if (i8 >= -30) {
                                    i4 = ((i8 + 30) / 5) + 10;
                                } else if (i8 >= -100) {
                                    i4 = ((i8 + 100) / 10) + 3;
                                } else if (i8 >= -200) {
                                    i4 = ((i8 + 200) / 50) + 1;
                                } else {
                                    i4 = 0;
                                }
                            } else if (i8 < 30) {
                                i4 = ((i8 - 20) / 5) + 32;
                            } else if (i8 < 100) {
                                i4 = ((i8 - 30) / 10) + 34;
                            } else if (i8 < 200) {
                                i4 = ((i8 - 50) / 100) + 41;
                            } else if (i8 < 1000) {
                                i4 = ((i8 - 200) / 100) + 43;
                            } else {
                                i4 = 51;
                            }
                            iArr[i4] = iArr[i4] + 1;
                            if (metric2 > metric3) {
                                hqyVar.f++;
                                hqyVar.k += i2;
                            }
                            if (metric2 > j) {
                                hqyVar.g++;
                                hqyVar.l += i2;
                            }
                        } else {
                            i2 = i7;
                            if (metric2 > j) {
                                hqyVar.f++;
                                hqyVar.k += i2;
                            }
                        }
                        int[] iArr2 = hqyVar.d;
                        int i9 = i2;
                        if (i9 <= 20) {
                            if (i9 >= 8) {
                                i3 = (i9 >> 1) - 2;
                            } else {
                                i3 = i9 / 4;
                            }
                        } else if (i9 <= 30) {
                            i3 = (i9 / 5) + 4;
                        } else if (i9 <= 100) {
                            i3 = (i9 / 10) + 7;
                        } else if (i9 <= 200) {
                            i3 = (i9 / 50) + 15;
                        } else if (i9 <= 1000) {
                            i3 = (i9 / 100) + 17;
                        } else {
                            i3 = 27;
                        }
                        iArr2[i3] = iArr2[i3] + 1;
                        hqyVar.i += i;
                        if (hqyVar.j < i9) {
                            hqyVar.j = i9;
                        }
                        hqyVar.m += i9;
                    }
                    i5 = i6 + 1;
                }
            }
            return;
        }
        hre hreVar3 = this.c;
        if (hreVar3 != null) {
            hreVar3.a(frameMetrics, this.b);
        }
    }
}
