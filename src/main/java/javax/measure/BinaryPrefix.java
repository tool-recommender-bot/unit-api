/*
 * Units of Measurement API
 * Copyright (c) 2014-2018, Jean-Marie Dautelle, Werner Keil, Otavio Santana.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * 3. Neither the name of JSR-385 nor the names of its contributors may be used to endorse or promote products
 *    derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package javax.measure;

/**
 * <p>
 * This class provides support for common binary prefixes to be used by units.
 * </p>
 *
 * @author <a href="mailto:units@catmedia.us">Werner Keil</a>
 * @version 1.3, April 20, 2018
 * @see <a href="https://en.wikipedia.org/wiki/Binary_prefix">Wikipedia: Binary Prefix</a>
 * @since 2.0
 */
public enum BinaryPrefix implements Prefix {
  KIBI("Ki", 1024, 1), //
  MEBI("Mi", 1024, 2), //
  GIBI("Gi", 1024, 3), //
  TEBI("Ti", 1024, 4), //
  PEBI("Pi", 1024, 5), //
  EXBI("Ei", 1024, 6), //
  ZEBI("Zi", 1024, 7), //
  YOBI("Yi", 1024, 8);

  /**
   * The symbol of this prefix, as returned by {@link #getSymbol}.
   *
   * @serial
   * @see #getSymbol()
   */
  private final String symbol;

  /**
   * Base part of the associated factor in base^exponent representation.
   */
  private int base;

  /**
   * Exponent part of the associated factor in base^exponent representation.
   */
  private int exponent;

  /**
   * Creates a new prefix.
   *
   * @param symbol
   *          the symbol of this prefix.
   * @param base
   *          part of the associated factor in base^exponent representation.
   * @param exponent
   *          part of the associated factor in base^exponent representation.
   */
  private BinaryPrefix(String symbol, int base, int exponent) {
    this.symbol = symbol;
    this.base = base;
    this.exponent = exponent;
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024</code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1024)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> KIBI(Unit<Q> unit) {
    return unit.prefix(KIBI);
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024<sup>2</sup></code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1048576)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> MEBI(Unit<Q> unit) {
    return unit.prefix(MEBI);
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024<sup>3</sup></code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1073741824)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> GIBI(Unit<Q> unit) {
    return unit.prefix(GIBI);
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024<sup>4</sup></code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1099511627776L)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> TEBI(Unit<Q> unit) {
    return unit.prefix(TEBI);
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024<sup>5</sup></code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1125899906842624L)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> PEBI(Unit<Q> unit) {
    return unit.prefix(PEBI);
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024<sup>6</sup></code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1152921504606846976L)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> EXBI(Unit<Q> unit) {
    return unit.prefix(EXBI);
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024<sup>7</sup></code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1152921504606846976d)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> ZEBI(Unit<Q> unit) {
    return unit.prefix(ZEBI);
  }

  /**
   * Returns the specified unit multiplied by the factor <code>1024<sup>8</sup></code> (binary prefix).
   * 
   * @param unit
   *          any unit.
   * @return <code>unit.multiply(1208925819614629174706176d)</code>.
   */
  public static <Q extends Quantity<Q>> Unit<Q> YOBI(Unit<Q> unit) {
    return unit.prefix(YOBI);
  }

  /**
   * Returns the symbol of this prefix.
   *
   * @return this prefix symbol, not {@code null}.
   */
  public String getSymbol() {
    return symbol;
  }

  /**
   * Base part of the associated factor in base^exponent representation.
   */
  public int getBase() {
    return base;
  }

  /**
   * Exponent part of the associated factor in base^exponent representation.
   */
  public int getExponent() {
    return exponent;
  }
}
